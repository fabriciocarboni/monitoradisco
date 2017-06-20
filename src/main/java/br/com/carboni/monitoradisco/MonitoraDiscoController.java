package br.com.carboni.monitoradisco;

import java.util.List;

import org.springframework.core.annotation.SynthesizedAnnotation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.carboni.utils.FileHandle;


@Controller
public class MonitoraDiscoController {
	

	@RequestMapping("/")
	public String index() throws Exception {

	
		return "index";
	}

	@GetMapping("/teste")
	public String teste(Model model) throws Exception {

		 /* Variaveis para valores dos arquivos acumulados*/
		//String path_monitora_disco = "/home/h_loadbd/MonitoraDiscoDPI/";
		String path_monitora_disco = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\arquivos\\";
//		String currentDate = DateFormat.FormatDate();
		String currentDate = "20170609";
		
//		String fileArquivosAcumulados = path_monitora_disco  + currentDate +  "_arquivos_acumulados_coletoras.txt";
			
		/*Dados para o grafico*/
	

		String file_coletora_10_81_40_4 = path_monitora_disco + "10.81.40.4" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_5 = path_monitora_disco + "10.81.40.5" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_6 = path_monitora_disco + "10.81.40.6" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_7 = path_monitora_disco + "10.81.40.7" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_8 = path_monitora_disco + "10.81.40.8" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_9 = path_monitora_disco + "10.81.40.9" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_10 = path_monitora_disco + "10.81.40.10" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_11 = path_monitora_disco + "10.81.40.11" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_12 = path_monitora_disco + "10.81.40.12" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";


		// Para contruir o eixo onde é exigito o horário, podemos utilizar apenas um dos arquivos pois todos são gerados sempre no mesmo horário.
		String chartArqAcumuladosCategoriesValues = ChartValuesBuilder.buildArrayCategories(file_coletora_10_81_40_4);
		model.addAttribute("chartArqAcumuladosCategoriesValues",chartArqAcumuladosCategoriesValues);
		
		
		String values_coletora_10_81_40_4 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_4);
		String values_coletora_10_81_40_5 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_5);
		String values_coletora_10_81_40_6 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_6);
		String values_coletora_10_81_40_7 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_7);
		String values_coletora_10_81_40_8 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_8);
		String values_coletora_10_81_40_9 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_9);
		String values_coletora_10_81_40_10 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_10);
		String values_coletora_10_81_40_11 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_11);
		String values_coletora_10_81_40_12 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_12);
		
		model.addAttribute("values_coletora_10_81_40_4",values_coletora_10_81_40_4);
		model.addAttribute("values_coletora_10_81_40_5",values_coletora_10_81_40_5);
		model.addAttribute("values_coletora_10_81_40_6",values_coletora_10_81_40_6);
		model.addAttribute("values_coletora_10_81_40_7",values_coletora_10_81_40_7);
		model.addAttribute("values_coletora_10_81_40_8",values_coletora_10_81_40_8);
		model.addAttribute("values_coletora_10_81_40_9",values_coletora_10_81_40_9);
		model.addAttribute("values_coletora_10_81_40_10",values_coletora_10_81_40_10);
		model.addAttribute("values_coletora_10_81_40_11",values_coletora_10_81_40_11);
		model.addAttribute("values_coletora_10_81_40_12",values_coletora_10_81_40_12);

		
		return "teste";
	}
	

	@GetMapping("/monitoradisco")
	public String monitoraDisco(Model model) throws Exception {
	    
		/* ######## Grafico de Arquivos em disco #### */
		
		// Variaveis producao
		
		 String path_monitora_disco = "/home/h_loadbd/MonitoraDiscoDPI/";
		 String currentDate = DateFormat.FormatDate();
		 String fileMonitoraDisco_325pl = path_monitora_disco + currentDate + "_monitora_disco.txt";
		 String fileMonitoraDisco_324pl = path_monitora_disco + currentDate + "_monitora_disco_324pl.txt";
		 String pathControleColeta = "/data/stage/dpi_sig/Controles/Coleta/";
		 String fileJaBaixados_324pl = path_monitora_disco + "ja_baixados_" + currentDate + "_324pl.txt";
		 String fileJaBaixados_325pl = pathControleColeta + "ja_baixados_" + currentDate + ".txt";

	 

//#####		Variaveis desenvolvimento //
/*		String path_monitora_disco = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\arquivos\\";
		String pathControleColeta = path_monitora_disco;
//		String currentDate = DateFormat.FormatDate();
		String currentDate = "20170609";
		String fileMonitoraDisco_325pl = path_monitora_disco + currentDate + "_monitora_disco.txt";
		String fileMonitoraDisco_324pl = path_monitora_disco + currentDate + "_monitora_disco_324pl.txt";
		String fileJaBaixados_324pl = path_monitora_disco + "ja_baixados_" + currentDate + "_324pl.txt";
		String fileJaBaixados_325pl = pathControleColeta + "ja_baixados_" + currentDate + ".txt";
*/

		String chartCategoriesValues = ChartValuesBuilder.buildArrayCategories(fileMonitoraDisco_325pl);
		String chartAmtOfFilesValues_324pl = ChartValuesBuilder.buildArrayAmtFilesValue(fileMonitoraDisco_324pl);
		String chartAmtOfFilesValues_325pl = ChartValuesBuilder.buildArrayAmtFilesValue(fileMonitoraDisco_325pl);
		String chartTotalFileSizeValues_324pl = BytesCollected.getAmtOfBytes(fileJaBaixados_324pl);
		String chartTotalFileSizeValues_325pl = BytesCollected.getAmtOfBytes(fileJaBaixados_325pl);
		
		model.addAttribute("chartCategoriesValues",chartCategoriesValues);
				
		model.addAttribute("chartAmtOfFilesValues_324pl",chartAmtOfFilesValues_324pl);
		model.addAttribute("chartAmtOfFilesValues_325pl",chartAmtOfFilesValues_325pl);
		
		model.addAttribute("chartTotalFileSizeValues_324pl",chartTotalFileSizeValues_324pl);
		model.addAttribute("chartTotalFileSizeValues_325pl",chartTotalFileSizeValues_325pl);
				
		
		
		/* ######## Grafico de Arquivos Acumulados #### */
		
		String arquivos_acumulados_output_path = "/home/h_loadbd/MonitoraDiscoDPI/outputs/";
//		String arquivos_acumulados_output_path = path_monitora_disco;
	
		String file_coletora_10_81_40_4 = arquivos_acumulados_output_path + "10.81.40.4" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_5 = arquivos_acumulados_output_path + "10.81.40.5" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_6 = arquivos_acumulados_output_path + "10.81.40.6" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_7 = arquivos_acumulados_output_path + "10.81.40.7" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_8 = arquivos_acumulados_output_path + "10.81.40.8" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_9 = arquivos_acumulados_output_path + "10.81.40.9" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_10 = arquivos_acumulados_output_path + "10.81.40.10" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_11 = arquivos_acumulados_output_path + "10.81.40.11" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";
		String file_coletora_10_81_40_12 = arquivos_acumulados_output_path + "10.81.40.12" + "_" + currentDate + "_arquivos_acumulados_coletoras.txt";


		// Para contruir o eixo onde é exigito o horário, podemos utilizar apenas um dos arquivos pois todos são gerados sempre no mesmo horário.
		String chartArqAcumuladosCategoriesValues = ChartValuesBuilder.buildArrayCategories(file_coletora_10_81_40_4);
		model.addAttribute("chartArqAcumuladosCategoriesValues",chartArqAcumuladosCategoriesValues);
		
		
		String values_coletora_10_81_40_4 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_4);
		String values_coletora_10_81_40_5 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_5);
		String values_coletora_10_81_40_6 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_6);
		String values_coletora_10_81_40_7 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_7);
		String values_coletora_10_81_40_8 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_8);
		String values_coletora_10_81_40_9 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_9);
		String values_coletora_10_81_40_10 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_10);
		String values_coletora_10_81_40_11 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_11);
		String values_coletora_10_81_40_12 = ChartValuesBuilder.buildArrayArqAcumuladosValues(file_coletora_10_81_40_12);
		
		model.addAttribute("values_coletora_10_81_40_4",values_coletora_10_81_40_4);
		model.addAttribute("values_coletora_10_81_40_5",values_coletora_10_81_40_5);
		model.addAttribute("values_coletora_10_81_40_6",values_coletora_10_81_40_6);
		model.addAttribute("values_coletora_10_81_40_7",values_coletora_10_81_40_7);
		model.addAttribute("values_coletora_10_81_40_8",values_coletora_10_81_40_8);
		model.addAttribute("values_coletora_10_81_40_9",values_coletora_10_81_40_9);
		model.addAttribute("values_coletora_10_81_40_10",values_coletora_10_81_40_10);
		model.addAttribute("values_coletora_10_81_40_11",values_coletora_10_81_40_11);
		model.addAttribute("values_coletora_10_81_40_12",values_coletora_10_81_40_12);
		
		
		/* ######## Grafico de Arquivos Acumulados #### */
		
		/* Grafico donuts de total de arquivos*/
		
		String path_324pl = "/home/h_loadbd/MonitoraDiscoDPI/outputs/brtlvlts0324pl_" + currentDate + "_total_arquivos_coletados.txt";
		String path_325pl = "/home/h_loadbd/MonitoraDiscoDPI/outputs/brtlvlts0325pl_" + currentDate + "_total_arquivos_coletados.txt";
//		String path_324pl = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\arquivos\\brtlvlts0324pl_" + currentDate + "_total_arquivos_coletados.txt";
//		String path_325pl = "C:\\Users\\A0050969\\git\\MonitoraDiscoDpi\\src\\main\\resources\\arquivos\\brtlvlts0325pl_" + currentDate + "_total_arquivos_coletados.txt";
		
		
		
		String brtlvlts0324pl_value = "brtlvlts0324pl: " + FileHandle.readFileAsString(path_324pl);
		String brtlvlts0325pl_value = "brtlvlts0325pl: " + FileHandle.readFileAsString(path_325pl);
	
		model.addAttribute("brtlvlts0324pl_value", brtlvlts0324pl_value);
		model.addAttribute("brtlvlts0325pl_value", brtlvlts0325pl_value);
		
//		System.out.println(brtlvlts0324pl_value);
//		System.out.println(brtlvlts0325pl_value);
		

		return "index";
	}

}
