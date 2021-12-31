package ch.zhaw.projectX.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crime {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String crimeSceneStreet;
	public String crimeSceneNumber;
	public String crimeSceneZip;
	public String crimeScenePlace;
	public String crimeWeapon;
	public String crimeName;
	
	
	public Crime(){
		
	}
	
	
	public Crime(int id, String crimeSceneStreet, String crimeSceneNumber, String crimeSceneZip, String crimeScenePlace,
			String crimeWeapon, String crimeName) {
		super();
		this.id = id;
		this.crimeSceneStreet = crimeSceneStreet;
		this.crimeSceneNumber = crimeSceneNumber;
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
		return crimeSceneStreet;
	}
	public void setCrimeSceneStreet(String crimeSceneStreet) {
		this.crimeSceneStreet = crimeSceneStreet;
	}
	public String getCrimeSceneNumber() {
		return crimeSceneNumber;
	}
	public void setCrimeSceneNumber(String crimeSceneNumber) {
		this.crimeSceneNumber = crimeSceneNumber;
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


