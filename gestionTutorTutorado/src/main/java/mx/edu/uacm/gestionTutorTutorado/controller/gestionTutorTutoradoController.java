package mx.edu.uacm.gestionTutorTutorado.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * @author ChristianFV
 *
 */

@Controller
public class gestionTutorTutoradoController {

	public static final Logger log = LogManager.getLogger(gestionTutorTutoradoController.class);
	
	@GetMapping("/")
	public String home(Model model) {
		log.debug("Entrando a home");
		return "home";	
	}
	
}
