package com.loan.achintya.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.achintya.data.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
