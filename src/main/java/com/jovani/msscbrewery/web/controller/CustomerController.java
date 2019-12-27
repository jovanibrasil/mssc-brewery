package com.jovani.msscbrewery.web.controller;

import com.jovani.msscbrewery.web.model.CustomerDto;
import com.jovani.msscbrewery.web.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID uuid){
        return new ResponseEntity<>(this.customerService.getCustomerById(uuid), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomerDto = this.customerService.saveCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", savedCustomerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto updatedCustomerDto = this.customerService.updateCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", updatedCustomerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/customerId")
    public void deleteCustomer(@PathVariable("customerId") UUID id){
        this.customerService.deleteCustomer(id);
    }


}
