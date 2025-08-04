package lk.ijse.gdse72.spbootdeployment.repository;

import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}