package com.jovani.msscbrewery.web.services;

import com.jovani.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        log.info("Getting customer by id. ID = {}.", id);
        return CustomerDto.builder()
                .id(id)
                .customerName("Temp name")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        log.info("Saving customer.");
        return null;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        log.info("Updating customer");
        return null;
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.info("Deleting customer");
    }
}
