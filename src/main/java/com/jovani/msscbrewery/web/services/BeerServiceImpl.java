package com.jovani.msscbrewery.web.services;

import com.jovani.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return new BeerDto().builder()
                .id(id)
                .beerName("Bohemia")
                .beerStyle("Pilsen")
                .build();
    }
}
