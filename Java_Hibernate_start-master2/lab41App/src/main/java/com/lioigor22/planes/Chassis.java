package com.lioigor22.planes;

public class Chassis {

	public static final double MINRAD = 18;
	protected double radius;

	public Chassis() {

		radius = MINRAD;
	}

	public Chassis(double radius) throws WrongChassisRadiusException {

		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws WrongChassisRadiusException {
		if (radius > MINRAD)
			this.radius = radius;
		else {
			throw new WrongChassisRadiusException("Wrong chassis radius! Radius will be more than 18.");
		}
	}

	public static double getMinrad() {
		return MINRAD;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
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
		Chassis other = (Chassis) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chassis [radius=" + radius + "]";
	}

}
