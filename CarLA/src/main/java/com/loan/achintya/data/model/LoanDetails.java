package com.loan.achintya.data.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanid;
	private String loanStatus;
	private double requiredLoanamount;
}
