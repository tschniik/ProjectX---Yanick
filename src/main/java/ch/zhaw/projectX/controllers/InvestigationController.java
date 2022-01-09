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
	protected InvestigationRepository investigationRepository; //Protected: Methods or data declared as protected can be accessed from within the same class or subclasses of the same packages.

	public InvestigationController (MainRepository<Investigation> mainRepository, InvestigationRepository investigationRepository) {
		super(mainRepository); //ATTENTION: Super() is always just below the constructor!
		this.investigationRepository = investigationRepository;
	}
}
