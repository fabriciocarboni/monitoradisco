package br.com.carboni.monitoradisco;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MonitoraDiscoController {
	

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("/teste")
	public String teste() {

		return "teste";
	}
	
	//@RequestMapping("/teste2")
	@RequestMapping("/monitoradisco")
	public String monitoraDisco(Model model) throws Exception {
	    
//		String path = Configuracao.path_monitora_disco;
//		String fileName = DateFormat.FormatDate() + Configuracao.filename;
//		String amtOfFilesInDir = AmtOfFilesInDir.getAmtOfFiles(path);
		String fileJaBaixados = Configuracao.fileJaBaixados;
		String fileMonitoraDisco = Configuracao.fileMonitoraDisco;

		// para colocar em producao, comentar esta linha.
		// Deixar o jar atual gravar o arquivo _monitora_disco, pois este e a fonte de dados para o grafico
		//FileHandle.writeToFile(path, fileName, amtofFilesInDir, totalFileSize);
		
		//String chartValues = BuildCsv.buildArray(fileMonitoraDisco);
		String chartCategoriesValues = ChartValuesBuilder.buildArrayCategories(fileMonitoraDisco);
		String chartAmtOfFilesValues = ChartValuesBuilder.buildArrayAmtFilesValue(fileMonitoraDisco);
		String chartTotalFileSizeValues = BytesCollected.getAmtOfBytes(fileJaBaixados);
		
		model.addAttribute("chartCategoriesValues",chartCategoriesValues);
		model.addAttribute("chartAmtOfFilesValues",chartAmtOfFilesValues);
		model.addAttribute("chartTotalFileSizeValues",chartTotalFileSizeValues);
				
		//System.out.println(chartCategoriesValues);
		//System.out.println(chartAmtOfFilesValues);
		//System.out.println(chartTotalFileSizeValues);
		
		//return "grafico";
		return "index";
	}

}
