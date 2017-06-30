package com.carboni.monitoradisco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.carboni.monitoradisco.utils.ChartValuesBuilder;

@Controller
public class TestController {

	
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
	
}
