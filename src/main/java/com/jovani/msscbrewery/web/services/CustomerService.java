package com.jovani.msscbrewery.web.services;

import com.jovani.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
    CustomerDto saveCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDto);
    void deleteCustomer(UUID id);
}
