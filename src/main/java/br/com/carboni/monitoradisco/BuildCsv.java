package br.com.carboni.monitoradisco;

public class BuildCsv {
	
	
	public static String buildArray() {
		
		String path = Configuracao.path_monitora_disco;
				
		String header = "['Hora','qt Arquivos']" + ",";
		String arr = header +
//					"['" + DateFormat.FormatHour() + "']['" + AmtOfFilesInDir.getAmtOfFiles(path) + "']";
					"['" + DateFormat.FormatHour() +"'" +",'"+ AmtOfFilesInDir.getAmtOfFiles(path) + "'" + "']"; 

//				+ total_files_size + System.getProperty("line.separator"));
		
		
		return arr;
//		System.out.println(arr);
		
		
	}
	
	
}
