package com.greens;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.Pojo.Datum;
import com.Pojo.Support;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo2.Datum2;
import com.pojo2.Pojo;


public class SampleWrite {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
	

	File file=new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\ApiMavenProject\\src\\test\\resources\\write.json");
	ObjectMapper mapper=new ObjectMapper();
	
	Support s=new Support("https://www.omrbranch.com/", "mani");
	Datum2 d=new Datum2(123, "maniflight", "india", "chennai");
	Datum2 d1=new Datum2(234, "roja", "india", "karur");
	Datum2 d2=new Datum2(456, "kiruba", "indai", "karur");
	ArrayList<Datum2> a=new ArrayList<Datum2>();
	a.add(d);
	a.add(d1);
	a.add(d2);
	
	Pojo p=new Pojo(123, 321, 213, 143, a, s);
	mapper.writeValue(file, p);
	
	
	
	}	
}
