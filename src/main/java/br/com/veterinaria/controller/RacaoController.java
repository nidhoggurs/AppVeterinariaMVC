package br.com.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.veterinaria.model.negocio.Racao;
import br.com.veterinaria.model.service.RacaoService;

@Controller
public class RacaoController {

	@Autowired
	private RacaoService service;
	
	@RequestMapping(value = "/racoes", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("racoes", service.obterLista());
		
		return "racao/lista";
	}
	
	@RequestMapping(value = "/racao", method = RequestMethod.GET)
	public String showDetalhe() {
		return "racao/detalhe";
	}
	
	@RequestMapping(value = "/racao", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Racao racao
			) {
		
		service.incluir(racao);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/racao/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public RacaoService getService() {
		return service;
	}
	public void setService(RacaoService service) {
		this.service = service;
	}
}