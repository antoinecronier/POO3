package poo3;

import java.util.ArrayList;

public class Cosmonaute {
	private String firstname;
	private String lastname;
	private ArrayList<Destination> voyages;
	private ArrayList<Equipement> equipements;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public ArrayList<Destination> getVoyages() {
		return voyages;
	}
	public void setVoyages(ArrayList<Destination> voyages) {
		this.voyages = voyages;
	}
	public ArrayList<Equipement> getEquipements() {
		return equipements;
	}
	public void setEquipements(ArrayList<Equipement> equipements) {
		this.equipements = equipements;
	}

	public Cosmonaute(String firstname, String lastname,
			ArrayList<Destination> voyages, ArrayList<Equipement> equipements) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.voyages = voyages;
		this.equipements = equipements;
	}

	public Cosmonaute(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.voyages = new ArrayList<Destination>();
		this.equipements = new ArrayList<Equipement>();
	}
}
