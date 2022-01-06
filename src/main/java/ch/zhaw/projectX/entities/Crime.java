package ch.zhaw.projectX.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Crime {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String crimeName;
	private String crimeWeapon;
	private String crimeSceneStreetName;
	private String crimeSceneStreetNumber;
	private String crimeSceneZip;
	private String crimeScenePlace;

	@OneToMany
	private List<Investigation> investigation;
	
	
	public Crime(){
		
	}


	public Crime(int id, String crimeName, String crimeWeapon, String crimeSceneStreetName,
			String crimeSceneStreetNumber, String crimeSceneZip, String crimeScenePlace,
			List<Investigation> investigation) {
		super();
		this.id = id;
		this.crimeName = crimeName;
		this.crimeWeapon = crimeWeapon;
		this.crimeSceneStreetName = crimeSceneStreetName;
		this.crimeSceneStreetNumber = crimeSceneStreetNumber;
		this.crimeSceneZip = crimeSceneZip;
		this.crimeScenePlace = crimeScenePlace;
		this.investigation = investigation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCrimeName() {
		return crimeName;
	}


	public void setCrimeName(String crimeName) {
		this.crimeName = crimeName;
	}


	public String getCrimeWeapon() {
		return crimeWeapon;
	}


	public void setCrimeWeapon(String crimeWeapon) {
		this.crimeWeapon = crimeWeapon;
	}


	public String getCrimeSceneStreetName() {
		return crimeSceneStreetName;
	}


	public void setCrimeSceneStreetName(String crimeSceneStreetName) {
		this.crimeSceneStreetName = crimeSceneStreetName;
	}


	public String getCrimeSceneStreetNumber() {
		return crimeSceneStreetNumber;
	}


	public void setCrimeSceneStreetNumber(String crimeSceneStreetNumber) {
		this.crimeSceneStreetNumber = crimeSceneStreetNumber;
	}


	public String getCrimeSceneZip() {
		return crimeSceneZip;
	}


	public void setCrimeSceneZip(String crimeSceneZip) {
		this.crimeSceneZip = crimeSceneZip;
	}


	public String getCrimeScenePlace() {
		return crimeScenePlace;
	}


	public void setCrimeScenePlace(String crimeScenePlace) {
		this.crimeScenePlace = crimeScenePlace;
	}


	public List<Investigation> getInvestigation() {
		return investigation;
	}


	public void setInvestigation(List<Investigation> investigation) {
		this.investigation = investigation;
	}
	
	


	
	

}


