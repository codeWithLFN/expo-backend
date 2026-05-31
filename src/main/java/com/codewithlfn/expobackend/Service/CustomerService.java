package com.codewithlfn.expobackend.Service;

import com.codewithlfn.expobackend.Dto.CreateCustomerDTO;
import com.codewithlfn.expobackend.Entity.CustomerEntity;
import com.codewithlfn.expobackend.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public String createCustomer(CreateCustomerDTO request) {
        CustomerEntity customerEntity = CustomerEntity.builder().name(request.getName()).cellphone(request.getCellphone()).build();
        customerRepository.save(customerEntity);
        return "Customer created";
    }

    // Read
    public List<CustomerEntity> viewCustomers() {
        return customerRepository.findAll();
    }

    // Update customer
    public CustomerEntity updateCustomer(Integer id, CreateCustomerDTO request) {
        CustomerEntity customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        customer.setName(request.getName());
        customer.setCellphone(request.getCellphone());

        return customerRepository.save(customer);
    }

    // Remove Customer(Delete)
    public void deleteCustomer(Integer id) {
        if (!customerRepository.existsById(id)) {
            throw new RuntimeException("Customer not found");
        }
        customerRepository.deleteById(id);
    }

}
