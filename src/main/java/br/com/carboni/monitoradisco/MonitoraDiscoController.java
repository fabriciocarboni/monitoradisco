package br.com.carboni.monitoradisco;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonitoraDiscoController {
	
	@RequestMapping("/coleta")
	public String index() {
		
		return "index";
	}
	

}
