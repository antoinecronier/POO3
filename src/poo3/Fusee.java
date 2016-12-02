package poo3;

import java.util.ArrayList;

public class Fusee {
	private ArrayList<Cosmonaute> cosmonautes;
	private ArrayList<Soute> soutes;
	private Integer carburant;
	private ArrayList<Destination> historiqueDestination;
	private String name;

	public ArrayList<Cosmonaute> getCosmonautes() {
		return cosmonautes;
	}

	public void setCosmonautes(ArrayList<Cosmonaute> cosmonautes) {
		this.cosmonautes = cosmonautes;
	}

	public ArrayList<Soute> getSoutes() {
		return soutes;
	}

	public void setSoutes(ArrayList<Soute> soutes) {
		this.soutes = soutes;
	}

	public Integer getCarburant() {
		return carburant;
	}

	public void setCarburant(Integer carburant) {
		this.carburant = carburant;
	}

	public ArrayList<Destination> getHistoriqueDestination() {
		return historiqueDestination;
	}

	public void setHistoriqueDestination(
			ArrayList<Destination> historiqueDestination) {
		this.historiqueDestination = historiqueDestination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fusee(ArrayList<Cosmonaute> cosmonautes, ArrayList<Soute> soutes,
			Integer carburant, ArrayList<Destination> historiqueDestination,
			String name) {
		super();
		this.cosmonautes = cosmonautes;
		this.soutes = soutes;
		this.carburant = carburant;
		this.historiqueDestination = historiqueDestination;
		this.name = name;
	}

	public Fusee(String name) {
		super();
		this.cosmonautes = new ArrayList<Cosmonaute>();
		this.soutes = new ArrayList<Soute>();
		this.carburant = 0;
		this.historiqueDestination = new ArrayList<Destination>();
		this.name = name;
	}

	public Boolean besoinDeRavitailler(Destination destination) {
		if (this.carburant < destination.getCarburant()) {
			System.out.println("Attention il faut ravitailler la fusée de "
					+ (destination.getCarburant() - this.carburant)
					+ " pour effectuer le trajet aller, voyage refusé!!!");
			return true;
		} else {
			return false;
		}
	}

	public Boolean Embarquer(ArrayList<Cosmonaute> cosmonautes) {
		int souteSelector = 0;
		int souteWeight = 0;
		for (Cosmonaute cosmonaute : cosmonautes) {
			for (Equipement equipement : cosmonaute.getEquipements()) {
				if ((souteWeight + equipement.getPoids()) < this.soutes.get(
						souteSelector).getPoidsMax()) {
					souteWeight += equipement.getPoids();
					this.soutes.get(souteSelector).getEquipement()
							.add(equipement);
				} else {
					if (this.soutes.size() - 1 > souteSelector) {
						souteSelector++;
					} else {
						System.out
								.println("Error tous les équipements ne peuvent pas être embarqué!!!\nSeul les cosmonautes :");
						for (Cosmonaute cosmonauteNav : this.cosmonautes) {
							System.out.println("  - " + cosmonauteNav.getFirstname() + " " + cosmonauteNav.getLastname());
						}
						System.out.println("Voyageront!!!");

						return false;
					}
				}
			}
			this.cosmonautes.add(cosmonaute);
		}
		return true;
	}

	public Boolean Voyager(Destination destination) {
		if (!this.besoinDeRavitailler(destination)) {
			for (Cosmonaute cosmonaute : cosmonautes) {
				cosmonaute.getVoyages().add(destination);
				System.out.println("Le cosmonaute " + cosmonaute.getFirstname()
						+ " " + cosmonaute.getLastname() + " voyage vers "
						+ destination.getName() + ".");
			}
			this.getHistoriqueDestination().add(destination);
			this.carburant -= destination.getCarburant();

			System.out.println("Voyage vers " + destination.getName() + " terminé.");

			return true;
		} else {
			return false;
		}
	}

	public void Debarquer() {
		this.cosmonautes.clear();
		for (Soute soute : soutes) {
			soute.getEquipement().clear();
		}
		System.out.println("Debarquement sur "
				+ this.historiqueDestination.get(
						this.historiqueDestination.size() - 1).getName());
	}
}
