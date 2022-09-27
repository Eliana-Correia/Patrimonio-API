package com.algaworks.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.patrimonio.model.item;
import com.algaworks.patrimonio.repository.itemRepository;


//avisar para o Spring que ela é uma classe passivel de atender as requisições http que chegarem para essa aplicação  
//iremos avisar com esse comando, ele fará todo o mapeamento dessa classe para quando chegar a requisição o spring irá invocar o metodo referente a requisição que chegar
//fará com que o spring enxerge a classe como controlador
@RestController
//nessa anotação iremos utilizar o CrossOrigin 
@CrossOrigin("${origem-permitida}")
public class ItemResource {
	
	//vamos devolver a informação que foi pedida e criar a informação que for passada na requisição para inserção de informação
	//dirá para fazer a injeção
	@Autowired
	private itemRepository ItemRepository;
	
	//vamos criar o primeiro metodo. Esse vai atender uma requisição http
	//vai listar as informações da base de dados, listar todos os itens da base de dados
	//vamos mapear qual tipo de requisição cada operação vai atender, nesse caso será o tipo Get
	@GetMapping("/itens")
	public List<item> Listar (){
		//o findAll devolve todos os itens da base de dados
		return ItemRepository.findAll();
	}
	
	//@requestBody o que estiver no corpo da requisição, ele vai pegar e criar uma instencia de Item, preencher e passar para o metodo adicionar
	//@valid, para que o metodo seja validado
	//o mapeamento dessa operação será o PostMapping
	//não houve conflito entre o Get e o Post usando o itens, pq são mapeamentos diferentes
	@PostMapping("/itens")
	public item adicionar(@RequestBody @Valid item Item) {
		return ItemRepository.save(Item);
	}
}
