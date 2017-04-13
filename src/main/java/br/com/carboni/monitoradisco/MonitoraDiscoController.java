package br.com.carboni.monitoradisco;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.carboni.utils.FileHandle;

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
	
	@RequestMapping("/teste2")
	public String teste2(Model model) throws Exception {
	    
		String path = Configuracao.path_monitora_disco;
		String fileName = DateFormat.FormatDate() + Configuracao.filename;
		String amtofFilesInDir = AmtOfFilesInDir.getAmtOfFiles(path);
		String fileJaBaixados = Configuracao.fileJaBaixados;
		String totalFileSize = BytesCollected.getAmountOfBytes(path, fileJaBaixados);

		// para colocar em produção, comentar esta linha.
		// Deixar o jar atual gravar o arquivo _monitora_disco, pois este é a fonte de dados para o grafico
		FileHandle.writeToFile(path, fileName, amtofFilesInDir, totalFileSize);
		
		String chartValues = BuildCsv.buildArray(path, fileName);
		
		model.addAttribute("chartValues",chartValues);
		
		System.out.println(chartValues);
		
		return "teste2";
	}

}
