package com.jovani.msscbrewery.web.services;

import com.jovani.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);
    BeerDto saveBeer(BeerDto beerDto);
    BeerDto updateBeer(BeerDto beerDto);
    void deleteBeer(UUID id);
}
