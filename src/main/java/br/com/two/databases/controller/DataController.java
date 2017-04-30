package br.com.two.databases.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.two.databases.model.Endereco;
import br.com.two.databases.model.Nome;
import br.com.two.databases.repository.EnderecoRepository;
import br.com.two.databases.repository.NomeRepository;

@RestController
@RequestMapping(path = "/data")
public class DataController {

	@Autowired
	private NomeRepository nomeRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@RequestMapping(path = "/nomes", 
					method = RequestMethod.GET, 
					produces = MediaType.APPLICATION_JSON)
	public @ResponseBody List<Nome> getNomes() {
		return this.nomeRepository.findAll();
	}

	@RequestMapping(path = "/enderecos", 
					method = RequestMethod.GET, 
					produces = MediaType.APPLICATION_JSON)
	public @ResponseBody List<Endereco> getEnderecos() {
		return this.enderecoRepository.findAll();
	}
}
