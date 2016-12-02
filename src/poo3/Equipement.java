package poo3;

public class Equipement {
	private String name;
	private Integer quantite;
	private Double poidsUnitaire;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Double getPoids() {
		return poidsUnitaire * this.quantite;
	}
	public void setPoidsUnitaire(Double poidsUnitaire) {
		this.poidsUnitaire = poidsUnitaire;
	}

	public Equipement(String name, Integer quantite, Double poidsUnitaire) {
		super();
		this.name = name;
		this.quantite = quantite;
		this.poidsUnitaire = poidsUnitaire;
	}
}
