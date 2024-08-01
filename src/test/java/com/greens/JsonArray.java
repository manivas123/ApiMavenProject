package com.greens;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonArray {
  
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader filereader=new FileReader("C:\\Users\\SCLPT 059\\eclipse-workspace\\ApiMavenProject\\src\\test\\resources\\Array.json");
		JSONParser jsonparser=new JSONParser();
		Object object = jsonparser.parse(filereader);
		JSONObject jsonobject= (JSONObject)object;
		
		Object object4 = jsonobject.get("page");
		System.out.println(object4);
		Object object5 = jsonobject.get("per_page");
		System.out.println(object5);
		Object object6 = jsonobject.get("total");
		System.out.println(object6);
		Object object7 = jsonobject.get("total_pages");
		System.out.println(object7);
		
		Object object2 = jsonobject.get("data");
		JSONArray array= (JSONArray) object2;
		
		for (int i = 0; i < array.size(); i++) {
			Object object3 = array.get(i);
			
			JSONObject a1=(JSONObject) object3;
			Object object8 = a1.get("id");
			System.out.println(object8);
			
			Object object9 = a1.get("flightName");
			System.out.println(object9);
			
			Object object10 = a1.get("Country");
			System.out.println(object10);
			
			Object object11 = a1.get("Destinations");
			System.out.println(object11);
			
			Object object12 = a1.get("URL");
			System.out.println(object12);
			
			
			
		}
		Object object3 = jsonobject.get("support");
		JSONObject a2=(JSONObject) object3;
		 Object object8 = a2.get("url");
		System.out.println(object8);
		
		Object object9 = a2.get("text");
		System.out.println(object9);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
