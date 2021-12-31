package ch.zhaw.projectX.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simple {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public String eyewitnessName;

	public Simple() {
		
	}
	
	
	public Simple(int id, String eyewitnessName) {
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
