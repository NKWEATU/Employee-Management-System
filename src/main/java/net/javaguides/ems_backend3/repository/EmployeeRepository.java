package net.javaguides.ems_backend3.repository;

import net.javaguides.ems_backend3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
