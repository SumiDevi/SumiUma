package com.example.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.ResponseDTO;
import com.example.hello.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public ResponseDTO getAllCustomerValues()
	{
		Object person=customerRepository.findAll();
		ResponseDTO rdto=new ResponseDTO("Something went wrong",false);
		if(person != null)
		{
			rdto.setMessage("Person saved successfully");
			rdto.setStatus(true);
			rdto.setData(person);
		}
		return rdto;
	}

}
