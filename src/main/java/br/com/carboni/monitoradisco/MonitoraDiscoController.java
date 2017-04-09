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
		String totalFileSize = BytesCollected.getAmountOfBytes();

		FileHandle.writeToFile(path, fileName, amtofFilesInDir, totalFileSize);
		
		String chartValues = BuildCsv.buildArray();
		
		model.addAttribute("chartValues",chartValues);

		return "teste2";
	}

}
