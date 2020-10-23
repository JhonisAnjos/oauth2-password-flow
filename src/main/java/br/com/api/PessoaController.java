package br.com.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
	
	
	@GetMapping("/pessoas")
	public List<Pessoa> findAllPessoas(){
		
		Pessoa jhonis = new Pessoa("Jhonis", 25);
		Pessoa marcos = new Pessoa("Marcos", 24);
		Pessoa rafael = new Pessoa("Rafael", 35);
		
		return Arrays.asList(jhonis, marcos, rafael);
	}

}
