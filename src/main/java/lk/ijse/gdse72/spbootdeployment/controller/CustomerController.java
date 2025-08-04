package lk.ijse.gdse72.spbootdeployment.controller;

import lk.ijse.gdse72.spbootdeployment.dto.CustomerDTO;
import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import lk.ijse.gdse72.spbootdeployment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getCustomers() {
        return "List of all customers";
    }

    @PostMapping("/add")
    public String addCustomer(@RequestBody CustomerDTO customerDTO) {
        Customer saved = customerService.saveCustomer(customerDTO);
        return "Customer added successfully: " + saved.getId();
    }
}