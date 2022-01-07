package ch.zhaw.projectX.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import ch.zhaw.projectX.repositories.MainRepository;

@RestController			
public class MainController<T> {// Weshalb braucht es hier Typ <T>
	
	@Autowired 
	protected MainRepository<T> mainRepository; //Protected: Methods or data declared as protected can be accessed from within the same class or subclasses of the same packages.
	
	
	public MainController(MainRepository<T> mainRepository) { 
		this.mainRepository = mainRepository;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<T>> findAll(){
		List<T> result = this.mainRepository.findAll();
			
		if (result != null && !result.isEmpty()) {
			return new ResponseEntity<List<T>>(result, HttpStatus.OK);}
		else {
			return new ResponseEntity<List<T>>(HttpStatus.NOT_FOUND);}
	}

	@GetMapping("/{id}")
	public ResponseEntity<T> findById(@PathVariable("id") long id) {  //long id is input variable. @PathVariable states that the input variable with the name id is the one from the URL
		if (this.mainRepository.existsById(id)) {  //findById() returns object, which you are searching for, existsById() returns true/false whether or not entity exists in repository
            	return new ResponseEntity<> (HttpStatus.OK);  
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	
	@PostMapping
	public ResponseEntity<T> create(@RequestBody T newEntity) {  //@RequestBody annotation maps the HttpRequest body (only the body of the response can be saved as a new entity)
	return new ResponseEntity<>(this.mainRepository.save(newEntity), HttpStatus.OK);
	}
	
	//Allenfalls weglassen da keine Updates im Frontend?
	@PutMapping("{id}")
	public ResponseEntity<T> update(@PathVariable("id") long id, T newEntity){ 
		  if (this.mainRepository.existsById(id)) { //findById() returns object, which you are searching for, existsById() returns true/false whether or not entity exists in repository
	            this.mainRepository.save(newEntity); 
	            	return new ResponseEntity<> (HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
		  }

		  
	@DeleteMapping("/{id}")
		public ResponseEntity<T> delete(@PathVariable("id") long id){
		if (this.mainRepository.existsById(id)) {  //findById() returns object, which you are searching for, existsById() returns true/false whether or not entity exists in repository
			this.mainRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}
