package ch.zhaw.projectX.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.springframework.lang.Nullable;

//@Entity 
//@Inheritance (strategy = InheritanceType.JOINED)
@MappedSuperclass 
public class Evidence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "evidence_name")
	private String evidenceName;

	@ManyToOne
	@JoinColumn(name = "parent_complex")
	private Complex parent_complex; 

		public Evidence() {
	}


	public Evidence(String evidenceName, Complex parent_complex) {
		this.evidenceName = evidenceName;
		this.parent_complex = parent_complex;
	}

	public String getEvidenceName() {
		return evidenceName;
	}

	public void setEvidenceName(String evidenceName) {
		this.evidenceName = evidenceName;
	}
	
	public Complex getParent_complex() {
		return parent_complex;
	}

	public void setParent_complex(Complex parent_complex) {
		this.parent_complex = parent_complex;
	}
	

}
