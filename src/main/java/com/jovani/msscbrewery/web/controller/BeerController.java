package com.jovani.msscbrewery.web.controller;

import com.jovani.msscbrewery.web.model.BeerDto;
import com.jovani.msscbrewery.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(this.beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody BeerDto beerDto){
        BeerDto savedBeerDto = this.beerService.saveBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", savedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateBeer(@RequestBody BeerDto beerDto){
        BeerDto updatedBeerDto = this.beerService.updateBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", updatedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/beerId")
    public void deleteBeer(@PathVariable("beerId") UUID id){
        this.beerService.deleteBeer(id);
    }

}
