package com.spring.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.workshopmongo.domain.User;
import com.spring.workshopmongo.dto.UserDTO;
import com.spring.workshopmongo.repository.UserRepository;
import com.spring.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj=repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encotrado!"));
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
}
