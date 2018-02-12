package lioigor22;

public class Vector {

	private double x;
	private double y;
	private double z;

	public Vector(double x, double y, double z) {

		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public double length() {

		return Math.sqrt(x * x + y * y + z * z);
	}

	public Vector add(Vector other) {

		return new Vector(x + other.x, y + other.y, z + other.z);

	}

	public double scalarMul(Vector other) {

		return (x * other.x + y * other.y + z * other.z);
	}

	public boolean isOrthogonality(Vector other) {

		if (scalarMul(other) == 0.0)
			return true;
		else
			return false;

	}

	public boolean isCrossingNoOrthogonalVectors(Vector other) {

		if (isOrthogonality(other))
			return false;
		else
			return true;

	}

	public int compareTo(Vector other) {

		return length() > other.length() ? 1 : length() == other.length() ? 0 : -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
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
		Vector other = (Vector) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}