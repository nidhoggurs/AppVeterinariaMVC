package br.com.veterinaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.veterinaria.model.negocio.Localidade;

@Service
public class LocalidadeService {
	
	@Autowired
	private RestTemplate rest;

	public List<Localidade> obterLista(){
		return (List<Localidade>)rest.getForObject("http://localhost:8080/api/localidade", List.class);
	}
	
	public void incluir(Localidade localidade) {
		rest.postForEntity("http://localhost:8080/api/localidade", localidade, String.class);	
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/localidade/{id}", id);	
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}