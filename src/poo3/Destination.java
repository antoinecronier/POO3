package poo3;

import java.util.Date;

public class Destination {
	private String name;
	private Double x;
	private Double y;
	private Date arrive;
	private Integer carburant;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	public Date getArrive() {
		return arrive;
	}
	public void setArrive(Date arrive) {
		this.arrive = arrive;
	}
	public Integer getCarburant() {
		return carburant;
	}
	public void setCarburant(Integer carburant) {
		this.carburant = carburant;
	}

	public Destination(String name, Double x, Double y, Date arrive,
			Integer carburant) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.arrive = arrive;
		this.carburant = carburant;
	}
}
