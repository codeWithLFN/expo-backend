package com.codewithlfn.expobackend.Controller;

import com.codewithlfn.expobackend.Dto.CreateCustomerDTO;
import com.codewithlfn.expobackend.Entity.CustomerEntity;
import com.codewithlfn.expobackend.Service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    //Create
    @PutMapping("/addCustomer")
    public String createCustomer(@Valid @RequestBody CreateCustomerDTO request) {
        log.info("Create Customer : {}", request.getName());
        return customerService.createCustomer(request);
    }

    // Read
    @GetMapping("/viewCustomers")
    public List<CustomerEntity> viewCustomers() {
        log.info("View Customer list");
        return customerService.viewCustomers();
    }
    // Update customer
    @PutMapping("/updateCustomer/{id}")
    public CustomerEntity updateCustomer(@PathVariable Integer id, @Valid @RequestBody CreateCustomerDTO request){
        log.info("Update Customer with id : {}", id);
        return customerService.updateCustomer(id, request);
    }
    // Remove Customer(Delete)
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        log.info("Delete Customer with id : {}", id);
        customerService.deleteCustomer(id);
    }
}
