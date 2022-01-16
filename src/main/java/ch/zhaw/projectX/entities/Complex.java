package ch.zhaw.projectX.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Complex extends Evidence{    //Because of extends we inherit the attributes "evidenceName", "parentComplex" and an "id"
	
	@Column(name = "date")
	private String date;
	
	public Complex() {
	}

	public Complex(String date, String evidenceName, Complex parent_complex) {
		super(evidenceName, parent_complex);  //To call the parent constructor we need to include the instances of the extended instance in the super-constructor 
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDnaFound(String date) {
		this.date = date;
	}

		
}
