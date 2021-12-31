package ch.zhaw.projectX.Controllers;

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

import ch.zhaw.projectX.Entities.Crime;
import ch.zhaw.projectX.Repositories.CrimeRepository;

@RestController
public class CrimeController {

	@Autowired
	private CrimeRepository repository;

	@GetMapping("/crime/all")
	public ResponseEntity<List<Crime>> findAllCrimes(){
		List<Crime> result = this.repository.findAll();
			
		if (result != null && !result.isEmpty()) {
			return new ResponseEntity<List<Crime>>(result, HttpStatus.OK);}
		else {
			return new ResponseEntity<List<Crime>>(HttpStatus.NOT_FOUND);}
	}

	@GetMapping("/crime/{id}")
	public ResponseEntity<Crime> findCrimeById(@PathVariable("id") int id) {
		if (this.repository.existsById(id)) {
            	return new ResponseEntity<> (HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	
	@PostMapping("/crime/create-crime")
	Crime newCrime(@RequestBody Crime newCrime) {
	return repository.save(newCrime);
	}
	
	@PutMapping("/crime/crime-details/{id}")
	public ResponseEntity<Crime> update(@PathVariable("id") int id){
		  if (this.repository.existsById(id)) {
	            this.repository.save();
	            	return new ResponseEntity<> (HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
		  }
		  //Wie/wo erhalte ich den Wert, welchen ich dann speichern mit save() muss?
		  
	@DeleteMapping("/crime/crime-details/{id}")
		public ResponseEntity<Crime> delete(@PathVariable("id") int id){
		if (this.repository.existsById(id)) {
			this.repository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
