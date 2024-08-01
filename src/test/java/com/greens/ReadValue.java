package com.greens;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.Pojo.Datum;
import com.Pojo.PojoR;
import com.Pojo.Support;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadValue {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException  {
		
	
	
	File file =new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\ApiMavenProject\\src\\test\\resources\\readvaluee.json"); 
	ObjectMapper mapper=new ObjectMapper();
	PojoR value = mapper.readValue(file, PojoR.class);
	
	
	System.out.println(value.getPage());
	System.out.println(value.getPer_page());
	System.out.println(value.getTotal_pages());
	
	ArrayList<Datum> data = value.getData();
	for (Datum c : data) {
		System.out.println(c.getId());
		System.out.println(c.getFlightName());
		System.out.println(c.getCountry());
		System.out.println(c.getDestinations());
		

	
	}
	Support support = value.getSupport();
	System.out.println(support.getText());
	System.out.println(support.getUrl());
	
}
}