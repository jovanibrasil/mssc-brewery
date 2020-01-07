package com.jovani.msscbrewery.web.mappers;

import com.jovani.msscbrewery.domain.Beer;
import com.jovani.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);

}
