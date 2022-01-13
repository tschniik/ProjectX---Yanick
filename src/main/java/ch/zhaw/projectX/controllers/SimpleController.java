package ch.zhaw.projectX.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Simple;
import ch.zhaw.projectX.repositories.EvidenceRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value = "/simple")
public class SimpleController extends EvidenceController<Simple>{
	
	public SimpleController(EvidenceRepository<Simple> evidenceRepository, MainRepository<Simple> mainRepository) {
		super(mainRepository, evidenceRepository);//ATTENTION: Super() is always just below the constructor!
	}
	
}
