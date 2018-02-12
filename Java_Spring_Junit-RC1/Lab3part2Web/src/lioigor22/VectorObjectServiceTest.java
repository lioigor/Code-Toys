package lioigor22;

import org.junit.Assert;
import org.junit.Test;

public class VectorObjectServiceTest {

	private Vector vector = new Vector(12.5, 45.0, 67.5);

	@Test
	public void checkScalarMul() {

		double scalar = vector.scalarMul(new Vector(12.5, 78.5, 44.5));

		Assert.assertEquals(true, scalar == 6692.5);
		Assert.assertEquals(false, scalar == 67.88);

	}

	@Test
	public void checkLength() {

		Assert.assertEquals(true, vector.length() == 82.08227579691001);
		Assert.assertEquals(false, vector.length() == 82.0564564656);
	}

	@Test
	public void checkisOrthogonality() {

		Assert.assertEquals(true, vector.isOrthogonality(new Vector(0, 0, 0)));
		Assert.assertEquals(false, vector.isOrthogonality(new Vector(0.7, 0.8, 0.9)));
	}

	@Test
	public void checkisCrossingNoOrthogonalVectors() {

		Assert.assertEquals(true, vector.isCrossingNoOrthogonalVectors(new Vector(0.79, 2.8, 5.9)));
		Assert.assertEquals(false, vector.isCrossingNoOrthogonalVectors(new Vector(0.0, 0.0, 0.0)));
	}

	@Test
	public void checkLessCompareTo() {

		Assert.assertEquals(true, vector.compareTo(new Vector(0.0, 0.0, 0.0)) == 1);
		Assert.assertEquals(false, vector.compareTo(new Vector(0.1, 67.0, 55.4)) == 0);
		Assert.assertEquals(true, vector.compareTo(new Vector(100.0, 200.0, 300.0)) == -1);
	}

}
