package br.com.carboni.monitoradisco;

import java.util.ArrayList;

import br.com.carboni.utils.FileHandle;


public class BuildCsv {

	public static StringBuilder buildArray() throws Exception {

		String path = Configuracao.path_monitora_disco;
		String currentDate = DateFormat.FormatDate();
		String filename = currentDate + Configuracao.filename;
		String header = "['Hora','Qt Arquivos', 'Qt bytes'],";
		
		
		ArrayList<String> chartValues = FileHandle.readFileAsListOfStrings(path, filename);
		
		StringBuilder sb = new StringBuilder(); // better performance than a simple foreach because
												// it only instantiates a single StringBuilder object outside of the for loop
//		sb.append(header);
		
		for (String s : chartValues) {
			
			String hr = s.split(";")[0];
			String qtFiles = s.split(";")[1];
			String totalSize = s.split(";")[2].replaceAll(",", "."); 
			
			sb.append("['");
			sb.append(hr);
			sb.append("',");
			sb.append(qtFiles);
			sb.append(",");
			sb.append(totalSize);
			sb.append("],");
			
		
		}
		
		sb.deleteCharAt(sb.length()-1);

//    	['0:00',  37.8,  2.76],
//    	['0:15',  30.8,  2.90],
//    	['0:20',  15.8,  3.10]
		
//		System.out.println(sb);
//		System.out.println(sb.getClass().getName());

		return sb;

	}

}