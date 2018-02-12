package lioigor22;

import java.util.ArrayList;

public class VectorsStorage {

	private ArrayList<Vector> vectors;

	public VectorsStorage() {

		vectors = new ArrayList<Vector>();

	}

	public void addVector(Vector vector) throws VectorCountException {

		if (vectors.size() < 3)
			vectors.add(vector);
		else
			throw new VectorCountException(
					"For checking on coplanarity of vectors just need only three vectors, that have already been recorded! For add a new vector just delete old!");
	}

	public void removeVector(Vector vector) {

		vectors.remove(vector);
	}

	public boolean isCoplanar() {

		double determinant;

		int i = 0;

		determinant = vectors.get(i).getX() * vectors.get(i + 1).getY() * vectors.get(i + 2).getZ()
				- vectors.get(i).getX() * vectors.get(i + 1).getZ() * vectors.get(i + 2).getY()
				+ vectors.get(i + 1).getX() * vectors.get(i + 2).getY() * vectors.get(i).getZ()
				- vectors.get(i + 1).getX() * vectors.get(i + 2).getZ() * vectors.get(i).getY()
				+ vectors.get(i + 2).getX() * vectors.get(i).getY() * vectors.get(i + 2).getZ()
				- vectors.get(i + 2).getX() * vectors.get(i).getZ() * vectors.get(i + 1).getY();

		if (determinant == 0.0)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vectors == null) ? 0 : vectors.hashCode());
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
		VectorsStorage other = (VectorsStorage) obj;
		if (vectors == null) {
			if (other.vectors != null)
				return false;
		} else if (!vectors.equals(other.vectors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VectorsStorage [vectors=" + vectors + "]";
	}

}
