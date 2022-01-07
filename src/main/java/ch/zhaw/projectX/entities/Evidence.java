package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
public class Evidence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "evidence_name")
	private String EvidenceName;
	
	@OneToMany
	@JsonIgnoreProperties(value = "investigation") // //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
	private List<Investigation> investigation;
	
	@ManyToOne
	@JoinColumn(name = "complex_id")  //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
	@JsonIgnoreProperties(value = "complex")  // @JsonIgnoreProperties is used at class level to mark a property or list of properties to be ignored. Without ignoring the properties I would receive a table complex_evidence
	private Complex complex;

	
	public Evidence() {
		
	}

	public Evidence(int id, String evidenceName, List<Investigation> investigation, Complex complex) {
		super();
		this.id = id;
		this.EvidenceName = evidenceName;
		this.investigation = investigation;
		this.complex = complex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvidenceName() {
		return EvidenceName;
	}

	public void setEvidenceName(String evidenceName) {
		EvidenceName = evidenceName;
	}

	public List<Investigation> getInvestigation() {
		return investigation;
	}

	public void setInvestigation(List<Investigation> investigation) {
		this.investigation = investigation;
	}

	public Complex getComplex() {
		return complex;
	}

	public void setComplex(Complex complex) {
		this.complex = complex;
	}
	
	

	
	
	
}
