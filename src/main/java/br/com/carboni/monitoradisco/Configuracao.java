package br.com.carboni.monitoradisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.carboni.monitoradisco.DateFormat;

@SpringBootApplication
public class Configuracao {
	
// Variaveis producao
	
	 public static String path_monitora_disco = "/home/h_loadbd/MonitoraDiscoDPI/";
//	 public static String work_dir = "/data/stage/dpi_sig/Controles/Coleta/stage_tmp/"; 
	 public static String currentDate = DateFormat.FormatDate();
	 public static String fileMonitoraDisco = path_monitora_disco + currentDate + "_monitora_disco.txt";
	 public static String pathControleColeta = "/data/stage/dpi_sig/Controles/Coleta/";
	 public static String fileJaBaixados = pathControleColeta + "ja_baixados_" + currentDate + ".txt";
	 
	 

//	Variaveis desenvolvimento
/*	public static String path_monitora_disco = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\arquivos\\";
	public static String pathControleColeta = path_monitora_disco;
	public static String fileMonitoraDisco = path_monitora_disco + "20170409_monitora_disco.txt";
	public static String fileJaBaixados = pathControleColeta + "ja_baixados_20170409.txt";*/
	 
	 
		
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

}

