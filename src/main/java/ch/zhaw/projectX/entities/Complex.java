package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Complex {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "dna_found")
	private String DNAFound;
	
	@OneToMany
	@JsonIgnoreProperties(value = "evidence")  //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
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
