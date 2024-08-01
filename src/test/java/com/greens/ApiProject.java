package com.greens;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiProject {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader filereader=new FileReader("C:\\Users\\SCLPT 059\\eclipse-workspace\\ApiMavenProject\\src\\test\\resources\\ApiProject.json");
		JSONParser jsonparser=new JSONParser();
		Object object = jsonparser.parse(filereader);
		
		JSONObject jsonobject= (JSONObject)object;
		
		Object object2 = jsonobject.get("data");
		
		
	JSONObject json=(JSONObject)object2;
		Object object3 = json.get("id");
		System.out.println(object3);
		Object object4 = json.get("flightName");
		System.out.println( object4);
		Object object5 = json.get("Country");
		System.out.println(object5);
		Object object6 = json.get("Destinations");
		System.out.println(object6);
		Object object7 = json.get("URL");
		System.out.println(object7);
		Object object8 = json.get("Created_Date");
		System.out.println( object8);
		Object object9 = json.get("Updated_Date");
		System.out.println(object9);
		 
		Object object10 = jsonobject.get("support");
		JSONObject son=(JSONObject)object10;
		Object object11 = son.get("url");
		System.out.println(object11);
		Object object12 = son.get("text");
		System.out.println(object12);
		
		
		
		
		
	}
	
	
	
	
	
}
