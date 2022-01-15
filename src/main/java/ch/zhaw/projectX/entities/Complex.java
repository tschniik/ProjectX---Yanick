package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


@Entity
public class Complex extends Evidence{ 

	
	@Column(name = "date")
	private String date;
	
/*	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id; */

	
	
	public Complex() {
	}

	public Complex(String date, String evidenceName, long id_complex) {
		super(evidenceName, id_complex);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDnaFound(String date) {
		this.date = date;
	}

		
}
