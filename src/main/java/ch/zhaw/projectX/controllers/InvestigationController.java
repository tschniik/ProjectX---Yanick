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
	private InvestigationRepository investigationRepository;

	public InvestigationController (MainRepository<Investigation> mainRepository, InvestigationRepository investigationRepository) {
		super(mainRepository); //Fehler einbauen indem super(mainRepository eine Zeile weiter unten, dann geht es nicht mehr)
		this.investigationRepository = investigationRepository;
	}
}
