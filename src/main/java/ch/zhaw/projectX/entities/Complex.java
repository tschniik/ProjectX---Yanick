package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Complex {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String DNAFound;
	
	@OneToMany
	private List <Evidence> evidence;

	private Complex() {
		
	}

	public Complex(int id, String dNAFound, List<Evidence> evidence) {
		super();
		this.id = id;
		this.DNAFound  = dNAFound;
		this.evidence = evidence;
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

	public List<Evidence> getEvidence() {
		return evidence;
	}

	public void setEvidence(List<Evidence> evidence) {
		this.evidence = evidence;
	}
	
	
	
	
	
}
