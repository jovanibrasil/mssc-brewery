package com.jovani.msscbrewery.web.mappers;

import com.jovani.msscbrewery.domain.Customer;
import com.jovani.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);

}
