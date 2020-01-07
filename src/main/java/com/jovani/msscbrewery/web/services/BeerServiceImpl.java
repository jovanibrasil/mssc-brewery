package com.jovani.msscbrewery.web.services;

import com.jovani.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        log.info("Getting beer by id. ID = {}.", id);
        return BeerDto.builder()
                .id(id)
                .beerName("Bohemia")
                .beerStyle("Pilsen")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        log.info("Saving beer.");
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public BeerDto updateBeer(BeerDto beerDto) {
        log.info("Updating beer.");
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void deleteBeer(UUID id) {
        log.info("Deleting beer.");
    }
}
