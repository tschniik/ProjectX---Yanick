package ch.zhaw.projectX.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ch.zhaw.projectX.entities.Complex;
import ch.zhaw.projectX.repositories.EvidenceRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value = "/complex")
public class ComplexController extends EvidenceController<Complex>{

	public ComplexController(MainRepository<Complex> mainRepository, EvidenceRepository<Complex> evidenceRepository) {
		super(mainRepository, evidenceRepository); //ATTENTION: Super() is always just below the constructor!
	}
}
