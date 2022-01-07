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
	private ComplexRepository complexRepository; //(Private final or just private): Since private methods are inaccessible, they are implicitly final in Java. So adding final specifier to a private method doesn't add any value
	
	public ComplexController(ComplexRepository complexRepository, MainRepository <Complex> mainRepository) {
		super(mainRepository); //ATTENTION: Super() is always just below the constructor!
		this.complexRepository = complexRepository;
	}
}
