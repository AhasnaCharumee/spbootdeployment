package lk.ijse.gdse72.spbootdeployment.service;

import lk.ijse.gdse72.spbootdeployment.dto.CustomerDTO;
import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import lk.ijse.gdse72.spbootdeployment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(CustomerDTO dto) {
        Customer customer = Customer.builder()
                .id(Long.valueOf(dto.getId()))
                .name(dto.getName())
                .address(dto.getAddress())
                .build();
        return customerRepository.save(customer);
    }
}