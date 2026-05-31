package com.codewithlfn.expobackend.Service;

import com.codewithlfn.expobackend.Dto.CreateCustomerDTO;
import com.codewithlfn.expobackend.Entity.CustomerEntity;
import com.codewithlfn.expobackend.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public String createCustomer(CreateCustomerDTO request) {
        CustomerEntity customerEntity = CustomerEntity.builder().name(request.getName()).cellphone(request.getCellphone()).build();
        customerRepository.save(customerEntity);
        return "Customer created";
    }
}
