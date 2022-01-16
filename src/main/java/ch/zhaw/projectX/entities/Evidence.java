package ch.zhaw.projectX.entities;

import java.util.List;

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

//@Entity 
//@Inheritance (strategy = InheritanceType.JOINED)
@MappedSuperclass 
public class Evidence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "evidence_name")
	private String evidenceName;
		

	@JoinColumn(name = "parent_complex")
	private long parent_complex; 

		public Evidence() {
	}


	public Evidence(String evidenceName, long parent_complex) {
		this.evidenceName = evidenceName;
		this.parent_complex = parent_complex;
	}

	public String getEvidenceName() {
		return evidenceName;
	}

	public void setEvidenceName(String evidenceName) {
		this.evidenceName = evidenceName;
	}
	
	public long getParent_complex() {
		return parent_complex;
	}

	public void setParent_complex(long parent_complex) {
		this.parent_complex = parent_complex;
	}
	
	
	
	

}
