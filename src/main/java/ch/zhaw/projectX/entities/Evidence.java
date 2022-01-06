package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Evidence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String EvidenceName;
	
	@OneToMany
	private List<Investigation> investigation;
	
	@ManyToOne
	private Complex complex;
	
	public Evidence() {
		
	}
	
	
	public Evidence(int id, String evidenceName) {
		super();
		this.id = id;
		EvidenceName = evidenceName;
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
	
	
	
}
