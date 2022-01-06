package ch.zhaw.projectX.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Investigation {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String CrimeCommissioner;
	private String PoliceDepartment;
	private Long InvestigationStart;
	
	@ManyToOne
	@JoinColumn(name = "crime_id")
	private Crime crime;
	//The annotation @JoinColumn indicates that this entity is the owner of the relationship 
	//(that is: the corresponding table has a column with a foreign key to the referenced table)
	
	@ManyToOne
	@JoinColumn(name = "evidence_id")
	private Evidence evidence;
	//The annotation @JoinColumn indicates that this entity is the owner of the relationship 
	//(that is: the corresponding table has a column with a foreign key to the referenced table)
	
	public Investigation() {
		
	}

	public Investigation(int id, String crimeCommissioner, String policeDepartment, Long investigationStart,
			Crime crime, Evidence evidence) {
		super();
		this.id = id;
		this.CrimeCommissioner = crimeCommissioner;
		this.PoliceDepartment = policeDepartment;
		this.InvestigationStart = investigationStart;
		this.crime = crime;
		this.evidence = evidence;
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

	public Long getInvestigationStart() {
		return InvestigationStart;
	}

	public void setInvestigationStart(Long investigationStart) {
		InvestigationStart = investigationStart;
	}

	public Crime getCrime() {
		return crime;
	}

	public void setCrime(Crime crime) {
		this.crime = crime;
	}

	public Evidence getEvidence() {
		return evidence;
	}

	public void setEvidence(Evidence evidence) {
		this.evidence = evidence;
	}
	
	

	
	
	
}
