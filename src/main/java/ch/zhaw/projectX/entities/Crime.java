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
	
	
	public Crime(int id, String crimeSceneStreetName, String crimeSceneStreetNumber, String crimeSceneZip, String crimeScenePlace,
			String crimeWeapon, String crimeName) {
		super();
		this.id = id;
		this.crimeSceneStreetName = crimeSceneStreetName;
		this.crimeSceneStreetNumber = crimeSceneStreetNumber;
		this.crimeSceneZip = crimeSceneZip;
		this.crimeScenePlace = crimeScenePlace;
		this.crimeWeapon = crimeWeapon;
		this.crimeName = crimeName;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCrimeWeapon() {
		return this.crimeWeapon;
	}
	public void setCrimeWeapon(String crimeWeapon) {
		this.crimeWeapon = crimeWeapon;
	}
	public String getCrimeName() {
		return this.crimeName;
	}
	public void setCrimeName(String crimeName) {
		this.crimeName = crimeName;
	}
	public String getCrimeSceneStreet() {
		return crimeSceneStreetName;
	}
	public void setCrimeSceneStreet(String crimeSceneStreet) {
		this.crimeSceneStreetName = crimeSceneStreet;
	}
	public String getCrimeSceneNumber() {
		return crimeSceneStreetNumber;
	}
	public void setCrimeSceneNumber(String crimeSceneNumber) {
		this.crimeSceneStreetNumber = crimeSceneNumber;
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

	
	

}


