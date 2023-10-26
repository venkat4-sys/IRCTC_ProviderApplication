package com.ashokit.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ashokit.request.PassengerDto;
import com.ashokit.request.Ticket;
import com.ashokit.service.IrctcService;

@Service
public class IrctcSeviceimpl implements IrctcService {

	private Integer ticketNum = 1;

	Map<Integer, Ticket> map = new HashMap<>();

	@Override
	public Ticket bookTicket(PassengerDto passenger) {

		Ticket t = new Ticket();

		BeanUtils.copyProperties(passenger, t);
		t.setStatus("Confirmed");
		t.setTicketcost(235);
		t.setTicketNumber(ticketNum);
		map.put(ticketNum, t);
		ticketNum++;

		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		
		if(map.containsKey(ticketNumber)) {
			return map.get(ticketNumber);
			
			
		}
		return null;
	}

}
