package lioigor22;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VectorsStorageObjectServiceTest {

	@Test
	public void checkThrowVectorCountExceptionInAddVector() {

		VectorsStorage storage = new VectorsStorage();

		try {
			storage.addVector(new Vector(1.1, 2.5, 8.7));
			storage.addVector(new Vector(5.5, 4.6, 9.9));
			storage.addVector(new Vector(1.8, 9.8, 66.77));
			storage.addVector(new Vector(1.9, 8.5, 88.32));

			fail("Test for addVector failed, not throw exception!");

		} catch (VectorCountException e) {

			Assert.assertTrue(true);
		}
	}

	@Test
	public void checkIsCoplanarAndRemove() {

		VectorsStorage storage = new VectorsStorage();
		try {
			storage.addVector(new Vector(0.0, 0.0, 0.0));
			storage.addVector(new Vector(0.0, 0.0, 0.0));
			storage.addVector(new Vector(0.0, 0.0, 0.0));
		} catch (VectorCountException e) {

		}
		Assert.assertEquals(true, storage.isCoplanar());

		storage.removeVector(new Vector(0.0, 0.0, 0.0));
		storage.removeVector(new Vector(0.0, 0.0, 0.0));
		storage.removeVector(new Vector(0.0, 0.0, 0.0));

		try {
			storage.addVector(new Vector(1.0, 2.35, 67.78));
			storage.addVector(new Vector(34.11, 55.0, 67.4));
			storage.addVector(new Vector(9.6, 2.4, 34.3));
		} catch (VectorCountException e) {

		}
		Assert.assertEquals(false, storage.isCoplanar());
	}
}
