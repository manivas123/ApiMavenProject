package com.pojo2;

import java.util.ArrayList;

import com.Pojo.Datum;
import com.Pojo.Support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor

public class Pojo {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Datum2> data;
	private Support support;
	
	

}
