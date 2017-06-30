package com.carboni.monitoradisco.controller;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.carboni.monitoradisco.utils.DatesAvailable;

@Controller
public class Teste2 {
	
	@Autowired
	private DatesAvailable datesAvailable;
	
	@GetMapping("/teste2")
	public String teste(){
		
		System.out.println(datesAvailable.getClass().isArray());

				
		/*for (String string : datesAvailable) {
			
			System.out.println(string);
		}*/
		
		return "teste2";
		
	}
	

}
