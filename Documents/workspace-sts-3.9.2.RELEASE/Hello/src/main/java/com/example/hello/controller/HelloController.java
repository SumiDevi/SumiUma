package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.ResponseDTO;
import com.example.hello.service.CustomerService;
@RequestMapping("/Customer")
@RestController
public class HelloController {
@Autowired 
CustomerService custService;
@GetMapping("/get")
public ResponseDTO get()
{
	System.out.println(custService.getAllCustomerValues());
	return custService.getAllCustomerValues();
}


}
