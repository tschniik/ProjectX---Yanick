package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complex extends Evidence{ 

	
	@Column(name = "date")
	private String date;
	
	
	public Complex() {
	}

	public Complex(int id, String date, String evidenceName, int id_complex) {
		super(id, evidenceName, id_complex);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDnaFound(String date) {
		this.date = date;
	}

		
}
