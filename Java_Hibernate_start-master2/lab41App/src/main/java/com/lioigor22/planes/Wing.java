package com.lioigor22.planes;

public class Wing {

	public static final double SIZE = 64.0;
	public static final long ASCENSIONAL_POWER = 256;
	private int id;
	private double size;
	protected double ascensionalPower;
	protected boolean fly;

	public Wing(double size, double ascensionalPower) {
		if (size > 64.0 && ascensionalPower > 256) {
			this.size = size;
			this.ascensionalPower = ascensionalPower;
		} else {
			System.out.println("Wrong parameters, default settings applied");
			this.size = SIZE;
			this.ascensionalPower = ASCENSIONAL_POWER;
		}
	}

	public Wing(long ascensionalPower) {
		if (ascensionalPower > 256) {
			this.size = SIZE;
			this.ascensionalPower = ascensionalPower;
		} else {
			System.out.println("Wrong parameters, default settings applied");
			this.ascensionalPower = ASCENSIONAL_POWER;
			this.size = SIZE;
		}
	}

	public Wing(double size) {
		if (size > 64) {
			this.size = size;
			this.ascensionalPower = ASCENSIONAL_POWER;
		} else {
			System.out.println("Wrong parameters, default settings applied");
			this.size = SIZE;
			this.ascensionalPower = ASCENSIONAL_POWER;
		}
	}

	public Wing() {
		this.size = SIZE;
		this.ascensionalPower = ASCENSIONAL_POWER;
	}

	public void toFly() {
		fly = true;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		if (size > 64.0)
			this.size = size;
		else
			System.out.println("Wrong size of the wing ( 64.0 < )");
	}

	public double getAscensionalPower() {
		return ascensionalPower;
	}

	public void setAscensionalPower(double ascensionalPower) {
		if (ascensionalPower > 256)
			this.ascensionalPower = ascensionalPower;
		else
			System.out.println("Wrong ascensional power of the wing ( 256 < )");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ascensionalPower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (fly ? 1231 : 1237);
		result = prime * result + id;
		temp = Double.doubleToLongBits(size);
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
		Wing other = (Wing) obj;
		if (Double.doubleToLongBits(ascensionalPower) != Double.doubleToLongBits(other.ascensionalPower))
			return false;
		if (fly != other.fly)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wing [id=" + id + ", size=" + size + ", ascensionalPower=" + ascensionalPower + ", fly=" + fly + "]";
	}

}