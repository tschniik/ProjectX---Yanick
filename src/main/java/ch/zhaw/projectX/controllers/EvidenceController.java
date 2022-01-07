package ch.zhaw.projectX.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Evidence;
import ch.zhaw.projectX.repositories.EvidenceRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value = "/evidence")
public class EvidenceController extends MainController<Evidence>{

	private EvidenceRepository evidenceRepository;
	
	public EvidenceController(EvidenceRepository evidenceRepository, MainRepository<Evidence> mainRepository) {
		super(mainRepository);
		this.evidenceRepository = evidenceRepository;
	}
	
}
