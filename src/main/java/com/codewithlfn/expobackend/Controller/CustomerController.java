package com.codewithlfn.expobackend.Controller;

import com.codewithlfn.expobackend.Dto.CreateCustomerDTO;
import com.codewithlfn.expobackend.Service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    @PutMapping("/viewCustomers")
    public String viewCustomers() {
        log.info("View Customer list");
        return "View Customer list";
    }
    // Update customer
    @PutMapping("/updateCustomer")
    public String updateCustomer(){
        log.info("Update Customer ");
        return "Update Customer ";
    }
    // Remove Customer(Delete)
    @PutMapping("/removeCustomer")
    public String deleteCustomer(){
        log.info("Delete Customer ");
        return "Delete Customer ";
    }
}
