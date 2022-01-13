package ch.zhaw.projectX.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simple extends Evidence{   

	
	@Column(name = "type")
	private String type;

	
	public Simple() {
	}
	
	
	public Simple(int id, String evidenceName, String type, int id_complex) {
		super(id, evidenceName, id_complex);
		this.type = type;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
