package ch.zhaw.projectX.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.projectX.entities.Complex;
import ch.zhaw.projectX.repositories.ComplexRepository;
import ch.zhaw.projectX.repositories.MainRepository;

@RestController
@RequestMapping(value = "/complex")
public class ComplexController extends MainController<Complex>{

	@Autowired
	private ComplexRepository complexRepository;
	
	public ComplexController(ComplexRepository complexRepository, MainRepository <Complex> mainRepository) {
		super(mainRepository);
		this.complexRepository = complexRepository;
	}
}
