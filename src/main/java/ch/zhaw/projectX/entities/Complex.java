package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Complex {  //extends Evidence (if using mapped superclass)

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "dna_found")
	private String DnaFound;
	
	@OneToMany
	@JoinColumn(name = "evidence_id") //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
	private List <Evidence> evidence;

	private Complex() {
		
	}

	public Complex(int id, String dNAFound, List<Evidence> evidence) {
		super();
		this.id = id;
		this.DnaFound  = dNAFound;
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
