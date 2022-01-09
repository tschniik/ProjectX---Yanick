package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complex extends Evidence{ 

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "dna_found")
	private String DnaFound;
	
	private List<Evidence> evidence;
	
	public Complex() {
	}

	public Complex(int id, String dnaFound, List<Evidence> evidence) {
		super();
		this.id = id;
		this.DnaFound = dnaFound;
		this.evidence = evidence;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDnaFound() {
		return DnaFound;
	}

	public void setDnaFound(String dnaFound) {
		DnaFound = dnaFound;
	}

	public List<Evidence> getEvidence() {
		return evidence;
	}

	public void setEvidence(List<Evidence> evidence) {
		this.evidence = evidence;
	}

		
}
