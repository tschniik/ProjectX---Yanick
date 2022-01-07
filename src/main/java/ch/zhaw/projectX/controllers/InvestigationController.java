package ch.zhaw.projectX.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Investigation;
import ch.zhaw.projectX.repositories.InvestigationRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value = "/investigation")
public class InvestigationController extends MainController<Investigation>{
	
	@Autowired
	private InvestigationRepository investigationRepository; //(Private final or just private):Since private methods are inaccessible, they are implicitly final in Java. So adding final specifier to a private method doesn't add any value

	public InvestigationController (MainRepository<Investigation> mainRepository, InvestigationRepository investigationRepository) {
		super(mainRepository); //ATTENTION: Super() is always just below the constructor!
		this.investigationRepository = investigationRepository;
	}
}
