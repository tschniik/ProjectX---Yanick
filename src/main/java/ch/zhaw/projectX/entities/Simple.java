package ch.zhaw.projectX.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Simple extends Evidence{   //Because of extends we inherit the attributes "evidenceName", "parentComplex" and an "id"
	
	@Column(name = "type")
	private String type;
	
	public Simple() {
	}
	
	
	public Simple(String evidenceName, String type, Complex parent_complex) {
		super(evidenceName, parent_complex); //To call the parent constructor we need to include the instances of the extended instance in the super-constructor 
		this.type = type;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
