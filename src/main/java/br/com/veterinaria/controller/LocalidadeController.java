package br.com.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.veterinaria.model.negocio.Localidade;
import br.com.veterinaria.model.service.LocalidadeService;

@Controller
public class LocalidadeController {

	@Autowired
	private LocalidadeService service;

	@RequestMapping(value = "/localidades", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("localidades", service.obterLista());
		
		return "localidade/lista";
	}
	
	@RequestMapping(value = "/localidade", method = RequestMethod.GET)
	public String showDetalhe() {
		return "localidade/detalhe";
	}
	
	@RequestMapping(value = "/localidade", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Localidade localidade
			) {
		
		service.incluir(localidade);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/localidade/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public LocalidadeService getService() {
		return service;
	}
	public void setService(LocalidadeService service) {
		this.service = service;
	}
}