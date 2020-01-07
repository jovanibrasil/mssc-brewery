package com.jovani.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    @NotBlank // Not null and trimmed length is greater than zero
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    private Long upc; // Universal Product Code

}
