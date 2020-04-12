package br.com.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.veterinaria.model.negocio.Higiene;
import br.com.veterinaria.model.service.HigieneService;

@Controller
public class HigieneController {

	@Autowired
	private HigieneService service;
	
	@RequestMapping(value = "/higieneItens", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("higieneItens", service.obterLista());
		
		return "higiene/lista";
	}
	
	@RequestMapping(value = "/higiene", method = RequestMethod.GET)
	public String showDetalhe() {
		return "higiene/detalhe";
	}
	
	@RequestMapping(value = "/higiene", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Higiene higiene
			) {
		
		service.incluir(higiene);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/higiene/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public HigieneService getService() {
		return service;
	}
	public void setService(HigieneService service) {
		this.service = service;
	}
}