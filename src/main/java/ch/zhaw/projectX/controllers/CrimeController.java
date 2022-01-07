package ch.zhaw.projectX.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Crime;
import ch.zhaw.projectX.repositories.CrimeRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value ="/crime") //Indicates that all web requests with /crime are mapped with this controller.
public class CrimeController extends MainController<Crime>{ //Weshalb <Crime>

	@Autowired
	private CrimeRepository crimeRepository;
	
	public CrimeController (MainRepository<Crime> mainRepository, CrimeRepository crimeRepository) { //Weshalb MainRepository<Crime>? Was hat das mit Crime zu tun un wie hat  das mit dem Konstruktor einen Zusammenhang
		super(mainRepository); //Nicht verstanden ->Konstruktor Vererbung ansehen ACHTUNG: Super() muss vor Wertzuweisung mit this. sein!
		this.crimeRepository = crimeRepository;
	
	}

	
	
}
