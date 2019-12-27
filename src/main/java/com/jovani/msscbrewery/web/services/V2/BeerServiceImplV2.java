package com.jovani.msscbrewery.web.services.V2;

import com.jovani.msscbrewery.web.model.BeerDto;
import com.jovani.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID id) {
        log.info("Getting beer by id. ID = {}.", id);
        return null;
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        log.info("Saving beer.");
        return null;
    }

    @Override
    public BeerDtoV2 updateBeer(BeerDtoV2 beerDto) {
        log.info("Updating beer.");
        return null;
    }

    @Override
    public void deleteBeer(UUID id) {
        log.info("Deleting beer.");
    }
}
