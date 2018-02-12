package com.lioigor22.model;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersStorageObjectServiceTest extends NumbersStorage {

	private ArrayList<Integer> list;

	@Before
	public void init() {
		list = new ArrayList<Integer>();
		list.add(32);
		list.add(-67);
		list.add(127);
		list.add(0);
	}

	@Test
	public void testFindFirstNegative() {

		NumbersStorage storage = new NumbersStorage(list);

		Assert.assertEquals(true, storage.findFirstNegativeNum() == -67);
		Assert.assertEquals(false, storage.findFirstNegativeNum() == 0);
	}

	@Test
	public void testFindPosEvenNumbers() {

		NumbersStorage storage = new NumbersStorage(list);

		Assert.assertEquals(true, (storage.findPosEvenNumbers().get(0) == 0) && (storage.findPosEvenNumbers().get(1) == 3));

		Assert.assertEquals(false, (storage.findPosEvenNumbers().get(0) == 0) && (storage.findPosEvenNumbers().get(1) == 1));
	}

	@Test
	public void testMulNumFirstNegative() {

		NumbersStorage storage = new NumbersStorage(list);

		storage.mulNumFirstNegative();

		Assert.assertEquals(true, storage.getArray().get(0) == -2144);
		Assert.assertEquals(false, storage.getArray().get(0) == -56);
	}

	@Test
	public void testContainsInArray() {

		NumbersStorage storage = new NumbersStorage();

		Assert.assertEquals(true, storage.containsInArray(127, list));
		Assert.assertEquals(false, storage.containsInArray(3, list));
	}

}
