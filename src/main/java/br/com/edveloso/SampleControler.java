package br.com.edveloso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.edveloso.modelo.Revisao;


@Controller
@RequestMapping("/")
public class SampleControler {

	/**
	 * @param args
	 */
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("sample", new Revisao("NOVO VALOR"));
		return "home";
	}

}
