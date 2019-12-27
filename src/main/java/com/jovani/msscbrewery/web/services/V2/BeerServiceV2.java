package com.jovani.msscbrewery.web.services.V2;

import com.jovani.msscbrewery.web.model.BeerDto;
import com.jovani.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID id);
    BeerDtoV2 saveBeer(BeerDtoV2 beerDto);
    BeerDtoV2 updateBeer(BeerDtoV2 beerDto);
    void deleteBeer(UUID id);
}
