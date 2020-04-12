package br.com.veterinaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.veterinaria.model.negocio.Higiene;

@Service
public class HigieneService {
	
	@Autowired
	private RestTemplate rest;

	public List<Higiene> obterLista(){
		return (List<Higiene>)rest.getForObject("http://localhost:8080/api/higiene", List.class);
	}
	
	public void incluir(Higiene higiene) {
		rest.postForEntity("http://localhost:8080/api/higiene", higiene, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/higiene/{id}", id);	
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}