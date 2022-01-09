package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
// import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

//@Entity 
@MappedSuperclass 
public class Evidence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "evidence_name")
	private String evidenceName;
	
	@ManyToOne  //One evidence of many points on complex
	@JoinColumn(name = "complex_id")  //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
	private Complex complex;

	private List<Investigation> investigation;
	
	public Evidence() {
		
	}


	public Evidence(int id, String evidenceName, Complex complex, List<Investigation> investigation) {
		super();
		this.id = id;
		this.evidenceName = evidenceName;
		this.complex = complex;
		this.investigation = investigation;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvidenceName() {
		return evidenceName;
	}

	public void setEvidenceName(String evidenceName) {
		this.evidenceName = evidenceName;
	}

	public Complex getComplex() {
		return complex;
	}

	public void setComplex(Complex complex) {
		this.complex = complex;
	}
	
	public List<Investigation> getInvestigation() {
		return investigation;
	}

	public void setInvestigation(List<Investigation> investigation) {
		this.investigation = investigation;
	}
	
}
