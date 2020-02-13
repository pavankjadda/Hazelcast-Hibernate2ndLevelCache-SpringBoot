package com.pj.hazelcastdemo.repository;

import com.pj.hazelcastdemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String>
{
}
