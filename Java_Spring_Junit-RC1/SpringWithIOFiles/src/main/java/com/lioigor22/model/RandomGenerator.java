package com.lioigor22.model;

import java.util.ArrayList;

public class RandomGenerator {

	public static ArrayList<Integer> getListRandomNumbers(int amountOfNumbers) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < amountOfNumbers; i++) {
			list.add((int) (amountOfNumbers / 2 - Math.round(amountOfNumbers * Math.random())));
		}

		return list;
	}

}
