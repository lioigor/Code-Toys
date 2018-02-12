package com.lioigor22.electrical;

public class Tv extends ElectricalAppliance {

	private String name;
	private boolean turnONTv;

	public Tv() {

	}

	public Tv(boolean turnOnTv, boolean pluggedIn, double voltage, double amperage) {

		super(pluggedIn, voltage, amperage);
		this.turnONTv = turnOnTv;
	}

	public Tv(String name) {

		this.name = name;
	}

	public boolean isPicture() {

		return (turnONTv == true && super.getPluggedIn() == true) ? true : false;
	}

	public boolean isTurnONTv() {
		return turnONTv;
	}

	public void setTurnONTv(boolean turnONTv) {
		this.turnONTv = turnONTv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (turnONTv ? 1231 : 1237);
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
		Tv other = (Tv) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (turnONTv != other.turnONTv)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tv [name=" + name + ", turnONTv=" + turnONTv + ", PluggedIn=" + getPluggedIn() + ", Voltage="
				+ getVoltage() + ", Amperage=" + getAmperage() + ", Id=" + getId() + "]";
	}

}
