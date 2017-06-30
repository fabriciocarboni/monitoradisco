package com.carboni.monitoradisco.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class DatesAvailable {
	

	public String[] verifyDatesAvailable() {
		
		
		String path = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\arquivos\\";
		File file = new File(path);
		
		String[] directories = file.list(new FilenameFilter() {
		
			@Override
			public boolean accept(File current, String name) {
			    return new File(current, name).isDirectory();
			  }
			});
		
		//System.out.println(Arrays.toString(directories));
		
		//ArrayList<String> d = new ArrayList<>(Arrays.asList(directories));
		//verificar pq esta retornando um array String[]
		// NBão seria melhor retornar um ArrayList e já iterar sobre ele em Teste2.java pois ja foi injetado
		
		return directories;
		
		
//		for (String string : directories) {
//			System.out.println(string);
			
		}
		
}
