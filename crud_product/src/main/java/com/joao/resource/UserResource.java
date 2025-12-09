package com.joao.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao.entities.User;




@RestController
@RequestMapping(value = "/users")
public class UserResource {
	// método que é um endPoint para acessar os usuários
	// o tipo de retorno vai ser o responseEntity que é um tipo específico do spring para retornar respostas de requisições web
	// o tipo de resposta vai ser miha classe User
	// com um método findAll(), que retorna os usuários
	
	
	@GetMapping
	public ResponseEntity<User>findAll(){
		User u = new User(1L,"MARIA" , "maria@yahoo.com", "0800","1234");
		return ResponseEntity.ok().body(u);
	}
}
