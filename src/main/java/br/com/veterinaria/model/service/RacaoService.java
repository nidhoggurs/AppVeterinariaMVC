package br.com.veterinaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.veterinaria.model.negocio.Racao;

@Service
public class RacaoService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Racao> obterLista(){
		return (List<Racao>)rest.getForObject("http://localhost:8080/api/racao", List.class);
	}
	
	public void incluir(Racao racao) {
		rest.postForEntity("http://localhost:8080/api/racao", racao, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/racao/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}