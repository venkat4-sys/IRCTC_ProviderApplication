package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.PassengerDto;
import com.ashokit.request.Ticket;
import com.ashokit.service.IrctcService;

@RestController
public class IrctcRestController {
	
	@Autowired
	private IrctcService irservice;
	
	@PostMapping("/bookTicket")
	public ResponseEntity<?> bookTicket(@RequestBody PassengerDto passenger){
		System.out.println(passenger);
		Ticket bookTicket = irservice.bookTicket(passenger);
		
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get/{ticketNum}")
	public ResponseEntity<?> getTicket(@PathVariable Integer ticketNum){
		Ticket ticket = irservice.getTicket(ticketNum);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
	

}
