package ch.zhaw.projectX.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Evidence;
import ch.zhaw.projectX.repositories.EvidenceRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value = "/evidence")
public class EvidenceController extends MainController<Evidence>{

	@Autowired
	private EvidenceRepository evidenceRepository;  //(Private final or just private): Since private methods are inaccessible, they are implicitly final in Java. So adding final specifier to a private method doesn't add any value
	
	public EvidenceController(EvidenceRepository evidenceRepository, MainRepository<Evidence> mainRepository) {
		super(mainRepository); //ATTENTION: Super() is always just below the constructor!
		this.evidenceRepository = evidenceRepository;
	}
	
}
