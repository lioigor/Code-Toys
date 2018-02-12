package com.lioigor22.electrical;

public class ElectricalAppliance {

	private int id;
	private boolean pluggedIn;
	private double voltage;
	private double amperage;

	public ElectricalAppliance() {

	}

	public ElectricalAppliance(boolean pluggedIn, double voltage, double amperage) {

		this.pluggedIn = pluggedIn;
		this.voltage = voltage;
		this.amperage = amperage;
	}

	public double CalculatePower() {

		return voltage * amperage;
	}

	public void setPluggedIn(boolean pluggedIn) {

		this.pluggedIn = pluggedIn;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public void setAmperage(double amperge) {
		this.amperage = amperge;
	}

	public boolean getPluggedIn() {
		return pluggedIn;
	}

	public double getVoltage() {
		return voltage;
	}

	public double getAmperage() {
		return amperage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amperage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (pluggedIn ? 1231 : 1237);
		temp = Double.doubleToLongBits(voltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricalAppliance other = (ElectricalAppliance) obj;
		if (Double.doubleToLongBits(amperage) != Double.doubleToLongBits(other.amperage))
			return false;
		if (pluggedIn != other.pluggedIn)
			return false;
		if (Double.doubleToLongBits(voltage) != Double.doubleToLongBits(other.voltage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ElectricalAppliance [id=" + id + ", pluggedIn=" + pluggedIn + ", voltage=" + voltage + ", amperage="
				+ amperage + "]";
	}

}
