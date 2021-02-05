package com.crud.dao;

import java.util.List;

import com.crud.domain.Customer;

public interface CustomerDao {
	long saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);

	Customer findCustomerById(Long id);

	List<Customer> findAllCustomers();
}
