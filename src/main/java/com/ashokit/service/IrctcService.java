package com.ashokit.service;

import com.ashokit.request.PassengerDto;
import com.ashokit.request.Ticket;

public interface IrctcService {
	
	public Ticket bookTicket(PassengerDto passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
