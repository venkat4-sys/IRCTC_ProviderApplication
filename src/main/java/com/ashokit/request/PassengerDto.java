package com.ashokit.request;

import lombok.Data;

@Data
public class PassengerDto {
	
	private String name;
    private String from;
	private String to;
	private String doj;
	private Integer trainNumber;

}
