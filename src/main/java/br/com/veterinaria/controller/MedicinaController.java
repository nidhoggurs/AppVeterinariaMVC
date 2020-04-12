package br.com.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.veterinaria.model.negocio.Medicina;
import br.com.veterinaria.model.service.MedicinaService;

@Controller
public class MedicinaController {

	@Autowired
	private MedicinaService service;
	
	@RequestMapping(value = "/medicinaServicos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("medicinaServicos", service.obterLista());
		
		return "medicina/lista";
	}
	
	@RequestMapping(value = "/medicina", method = RequestMethod.GET)
	public String showDetalhe() {
		return "medicina/detalhe";
	}
	
	@RequestMapping(value = "/medicina", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Medicina medicina
			) {
		
		service.incluir(medicina);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/medicina/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public MedicinaService getService() {
		return service;
	}
	public void setService(MedicinaService service) {
		this.service = service;
	}
}