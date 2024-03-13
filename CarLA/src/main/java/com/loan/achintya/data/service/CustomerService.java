package com.loan.achintya.data.service;

import java.util.List;
import java.util.Optional;

import com.loan.achintya.data.model.BaseResponse;
import com.loan.achintya.data.model.Customer;
import com.loan.achintya.data.model.SanctionDetails;
import com.loan.achintya.data.model.Transaction;
import com.lowagie.text.DocumentException;

public interface CustomerService {

	public Customer saveCustomer(Customer cust);

	public List<Customer> getAllCustomer();

	public Customer getByid(int custId);

	public Optional<Customer> getByVerified(int custId);

	public List<Customer> getAllVerifiedCustomer();

	public Customer getCustByid(int custId);

	public Customer saveSCust(Customer c);

	public void getSanction(int custId, String fromEmail) throws DocumentException;

	public BaseResponse saveTransactionHistory( int userId);

}
