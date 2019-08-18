package com.nondt.springbootrestapih2database.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nondt.springbootrestapih2database.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
