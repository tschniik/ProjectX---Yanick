package ch.zhaw.projectX.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Crime;
import ch.zhaw.projectX.repositories.CrimeRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value ="/crime") //Indicates that all web requests with /crime are mapped with this controller.
public class CrimeController extends MainController<Crime>{ 

	@Autowired
	private CrimeRepository crimeRepository; //(Private final or just private): Since private methods are inaccessible, they are implicitly final in Java. So adding final specifier to a private method doesn't add any value
	
	public CrimeController (MainRepository<Crime> mainRepository, CrimeRepository crimeRepository) { //Weshalb MainRepository<Crime>? Was hat das mit Crime zu tun un wie hat  das mit dem Konstruktor einen Zusammenhang
		super(mainRepository); //ATTENTION: Super() is always just below the constructor!
		this.crimeRepository = crimeRepository;
	
	}
	
}
