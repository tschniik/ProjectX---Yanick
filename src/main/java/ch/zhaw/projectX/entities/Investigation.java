package ch.zhaw.projectX.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Investigation {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "Crime_commissioner")
	private String CrimeCommissioner;
	
	@Column(name = "Police_department")
	private String PoliceDepartment;
	
	   
	@Column(name = "Investigation_start")
	private String InvestigationStart;
	
	@ManyToOne  //One investigation of many points on crime
	@JoinColumn(name = "crime_id")  //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
	private Crime crime;

	
	@ManyToOne //One investigation of many points on complex
	@JoinColumn(name = "complex_id")  //The annotation @JoinColumn indicates that this entity is the owner of the relationship (that is: the corresponding table has a column with a foreign key to the referenced table)
	private Complex complex; //Complex because since Mapped superclass is not visible in DB there's a direct connection between investigation & complex
	
	
	public Investigation() {
	}

	public Investigation(int id, String crimeCommissioner, String policeDepartment, String investigationStart,
			Crime crime, Complex complex) {
		super();
		this.id = id;
		this.CrimeCommissioner = crimeCommissioner;
		this.PoliceDepartment = policeDepartment;
		this.InvestigationStart = investigationStart;
		this.crime = crime;
		this.complex = complex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCrimeCommissioner() {
		return CrimeCommissioner;
	}

	public void setCrimeCommissioner(String crimeCommissioner) {
		CrimeCommissioner = crimeCommissioner;
	}

	public String getPoliceDepartment() {
		return PoliceDepartment;
	}

	public void setPoliceDepartment(String policeDepartment) {
		PoliceDepartment = policeDepartment;
	}

	public String getInvestigationStart() {
		return InvestigationStart;
	}

	public void setInvestigationStart(String investigationStart) {
		InvestigationStart = investigationStart;
	}

	public Crime getCrime() {
		return crime;
	}

	public void setCrime(Crime crime) {
		this.crime = crime;
	}

	public Complex getComplex() {
		return complex;
	}

	public void setComplex(Complex complex) {
		this.complex = complex;
	}
	
	

	
	
	
}
