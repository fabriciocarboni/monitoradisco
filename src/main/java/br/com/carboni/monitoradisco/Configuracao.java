package br.com.carboni.monitoradisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.carboni.monitoradisco.DateFormat;

@SpringBootApplication
public class Configuracao {
	
	 public static String path_monitora_disco = "/home/h_loadbd/MonitoraDiscoDPI/"; 
//	 public static String work_dir = "/data/stage/dpi_sig/Controles/Coleta/stage_tmp/"; 
	 public static String currentDate = DateFormat.FormatDate();
	 public static String fileMonitoraDisco = path_monitora_disco + currentDate + "_monitora_disco.txt"; 
	 public static String fileJaBaixados = "/data/stage/dpi_sig/Controles/Coleta/ja_baixados_" + currentDate + ".txt";
	 

/*	
	public static String path_monitora_disco = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\Arquivos\\";
//	public static String path_monitora_disco = "C:\\Users\\Fabricio\\git\\monitoradisco\\src\\main\\resources\\arquivos\\";
	public static String work_dir = path_monitora_disco;
	public static String filename = "_monitora_disco.txt";
	//public static String filename = "20170409_monitora_disco.txt";
	public static String path_controle_coleta = path_monitora_disco;
//	public static String fileJaBaixados = "ja_baixados_" + DateFormat.FormatDate() + ".txt";
	public static String fileJaBaixados = "ja_baixados_20170409.txt";

*/

//	https://developers.google.com/chart/interactive/docs/gallery/linechart		
// https://wiki.eclipse.org/EGit/User_Guide#Create_Repository_at_GitHub
		
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

}

