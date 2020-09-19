package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.service.BookingServiceImpl;

@CrossOrigin("https://localhost:4200")
@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	BookingServiceImpl service;
	
}