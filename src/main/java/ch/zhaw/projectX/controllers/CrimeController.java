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
	protected CrimeRepository crimeRepository; //Protected: Methods or data declared as protected can be accessed from within the same class or subclasses of the same packages.
	
	public CrimeController (MainRepository<Crime> mainRepository, CrimeRepository crimeRepository) { 
		super(mainRepository); //ATTENTION: Super() is always just below the constructor!
		this.crimeRepository = crimeRepository;
	
	}
	
}
