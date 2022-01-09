package ch.zhaw.projectX.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simple extends Evidence{   

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "eyewitness_name")
	private String eyewitnessName;

	public Simple() {
		
	}
	
	
	public Simple(int id, String eyewitnessName, String evidenceName) {
		super();
		this.id = id;
		this.eyewitnessName = eyewitnessName;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEyewitnessName() {
		return eyewitnessName;
	}

	public void setEyewitnessName(String eyewitnessName) {
		this.eyewitnessName = eyewitnessName;
	}
	
	
}
