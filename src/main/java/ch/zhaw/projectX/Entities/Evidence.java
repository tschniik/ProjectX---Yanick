package ch.zhaw.projectX.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Evidence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public String EvidenceName;
	
	
	
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
