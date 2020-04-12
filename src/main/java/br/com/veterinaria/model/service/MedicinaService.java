package br.com.veterinaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.veterinaria.model.negocio.Medicina;

@Service
public class MedicinaService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Medicina> obterLista(){
		return (List<Medicina>)rest.getForObject("http://localhost:8080/api/medicina", List.class);
	}
	
	public void incluir(Medicina medicina) {
		rest.postForEntity("http://localhost:8080/api/medicina", medicina, String.class);	
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/medicina/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}