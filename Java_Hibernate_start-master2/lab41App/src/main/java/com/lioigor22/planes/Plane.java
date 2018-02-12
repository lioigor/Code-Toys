package com.lioigor22.planes;

public class Plane extends Wing {
	private String name;
	private Chassis chassis;
	private String destination;

	@Override
	public void toFly() {
		super.toFly();
		System.out.println("Plane " + getName() + " flies to: " + getDestination());
	}

	public void toLand() {
		fly = false;
		System.out.println("Plane " + getName() + " is landed at: " + getDestination());
	}

	public void printDestination() {
		System.out.println(getDestination());
	}

	public Plane(double size, double ascensionalPower, String name) {
		super(size, ascensionalPower);
		this.name = name;
	}

	public Plane(long ascensionalPower, String name) {
		super(ascensionalPower);
		this.name = name;
	}

	public Plane(double size, String name) {
		super(size);
		this.name = name;
	}

	public Plane(String name) {
		this.name = name;
		chassis = new Chassis();
		destination = "noDestination";
	}

	public Plane() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		if (destination != null)
			this.destination = destination;
		else
			System.out.println("Wrong destination");
	}

	public Chassis getChassis() {
		return chassis;
	}

	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((chassis == null) ? 0 : chassis.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (chassis == null) {
			if (other.chassis != null)
				return false;
		} else if (!chassis.equals(other.chassis))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plane [name=" + name + ", chassis=" + chassis + ", destination=" + destination + ", Size=" + getSize()
				+ ", AscensionalPower=" + getAscensionalPower() + ", Id=" + getId() + "]";
	}

}