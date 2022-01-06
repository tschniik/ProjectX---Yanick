package ch.zhaw.projectX.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complex {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public String DNAFound;

	public Complex() {
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDNAFound() {
		return DNAFound;
	}

	public void setDNAFound(String dNAFound) {
		DNAFound = dNAFound;
	}
	
	
	
}
