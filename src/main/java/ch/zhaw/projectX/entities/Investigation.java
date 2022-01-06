package ch.zhaw.projectX.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Investigation {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String CrimeCommissioner;
	private String PoliceDepartment;
	private Long InvestigationStart;
	
	@ManyToOne
	private Crime crime;
	@ManyToOne
	private Evidence evidence;
	
	public Investigation() {
		
	}
	
	
	public Investigation(int id, String crimeCommissioner, String policeDepartment, Long investigationStart) {
		super();
		this.id = id;
		CrimeCommissioner = crimeCommissioner;
		PoliceDepartment = policeDepartment;
		InvestigationStart = investigationStart;
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

	
	
	
}
