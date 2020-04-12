package br.com.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.veterinaria.model.negocio.Veterinaria;
import br.com.veterinaria.model.service.ProdutoService;
import br.com.veterinaria.model.service.VeterinariaService;

@Controller
public class VeterinariaController {

	@Autowired
	private VeterinariaService service;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/veterinarias", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("veterinarias", service.obterLista());
		
		return "veterinaria/lista";
	}
	
	@RequestMapping(value = "/veterinaria", method = RequestMethod.GET)
	public String showDetalhe(
				Model model
			) {
		model.addAttribute("produtos", produtoService.obterLista());
		
		return "veterinaria/detalhe";
	}
	
	@RequestMapping(value = "/veterinaria", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Veterinaria veterinaria
			) {
		
		service.incluir(veterinaria);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/veterinaria/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public VeterinariaService getService() {
		return service;
	}
	public void setService(VeterinariaService service) {
		this.service = service;
	}
}