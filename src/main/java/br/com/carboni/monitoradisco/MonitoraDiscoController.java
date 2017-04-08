package br.com.carboni.monitoradisco;

import org.springframework.stereotype.Controller;
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

}
