package br.com.veterinaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.veterinaria.model.negocio.Veterinaria;

@Service
public class VeterinariaService {
	
	@Autowired
	private RestTemplate rest;

	public List<Veterinaria> obterLista(){
		return (List<Veterinaria>)rest.getForObject("http://localhost:8080/api/veterinaria", List.class);	
	}

	public void incluir(Veterinaria veterinaria) {
		rest.postForEntity("http://localhost:8080/api/veterinaria", veterinaria, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/veterinaria/{id}", id);
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}