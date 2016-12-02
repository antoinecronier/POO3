package poo3;

import java.util.ArrayList;

public class Soute {
	private String name;
	private ArrayList<Equipement> equipement;
	private Double poidsMax;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Equipement> getEquipement() {
		return equipement;
	}
	public void setEquipement(ArrayList<Equipement> equipement) {
		this.equipement = equipement;
	}
	public Double getPoidsMax() {
		return poidsMax;
	}
	public void setPoidsMax(Double poidsMax) {
		this.poidsMax = poidsMax;
	}

	public Soute(String name, ArrayList<Equipement> equipement, Double poidsMax) {
		super();
		this.name = name;
		this.equipement = equipement;
		this.poidsMax = poidsMax;
	}

	public Soute(String name, Double poidsMax) {
		super();
		this.name = name;
		this.equipement = new ArrayList<Equipement>();
		this.poidsMax = poidsMax;
	}
}
