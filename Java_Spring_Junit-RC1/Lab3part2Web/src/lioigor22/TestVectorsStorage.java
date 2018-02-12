package lioigor22;

public class TestVectorsStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VectorsStorage vs = new VectorsStorage();
		try {
		vs.addVector(new Vector(1.0, 2.35, 67.78));
		vs.addVector(new Vector(34.11, 55.0, 67.4));
		vs.addVector(new Vector(9.6, 2.4, 34.3));
	} catch (VectorCountException e) {

	}
		System.out.println(vs.toString());
	}
	
}
