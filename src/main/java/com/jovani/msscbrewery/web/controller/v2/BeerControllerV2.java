package com.jovani.msscbrewery.web.controller.v2;

import com.jovani.msscbrewery.web.model.v2.BeerDtoV2;
import com.jovani.msscbrewery.web.services.V2.BeerServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(this.beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody @Valid BeerDtoV2 beerDto){
        BeerDtoV2 savedBeerDto = this.beerService.saveBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", savedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateBeer(@RequestBody @Valid BeerDtoV2 beerDto){
        BeerDtoV2 updatedBeerDto = this.beerService.updateBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", updatedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{beerId}")
    public void deleteBeer(@PathVariable("beerId") UUID id){
        this.beerService.deleteBeer(id);
    }


}
