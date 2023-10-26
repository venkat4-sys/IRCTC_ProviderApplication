package com.ashokit.request;

import lombok.Data;

@Data
public class Ticket {
	
	private String name;
    private String from;
	private String to;
	private String doj;
	private Integer ticketNumber;
	private Integer ticketcost;
	private String status;

}
