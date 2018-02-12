package com.lioigor22.model;

import java.util.ArrayList;
import java.util.Iterator;

public class NumbersStorage {

	private ArrayList<Integer> array;

	public NumbersStorage() {

		array = new ArrayList<Integer>();
	}

	public NumbersStorage(ArrayList<Integer> array) {

		this.array = new ArrayList<Integer>();
		this.array.addAll(array);
	}

	public void addNumber(int arg) {

		array.add(arg);
	}

	public void removeNumber(int arg) {

		array.remove(arg);
	}

	public ArrayList<Integer> getArray() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(array);

		return list;
	}

	public void fillRandom(int amountOfNumbers) {

		array.clear();
		array = RandomGenerator.getListRandomNumbers(amountOfNumbers);
	}

	protected ArrayList<Integer> findPosEvenNumbers() {

		ArrayList<Integer> result = new ArrayList<Integer>();
		int position = 0;

		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			int element = iter.next();
			if (element % 2 == 0) {
				result.add(position);
			}
			position++;

		}
		return result;

	}

	protected boolean containsInArray(int value, ArrayList<Integer> array) {

		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			int element = iter.next();
			if (element == value)
				return true;
		}
		return false;
	}

	protected int findFirstNegativeNum() {

		int result = 0;

		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			int element = iter.next();
			if (element < 0) {
				result = element;
				break;
			}
		}
		return result;
	}

	public void mulNumFirstNegative() {

		ArrayList<Integer> tmp = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		tmp.addAll(findPosEvenNumbers());
		int fstNegative = findFirstNegativeNum();

		int step = 0;

		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			if (containsInArray(step, tmp)) {
				int element = iter.next() * fstNegative;
				result.add(element);
			} else {
				int element = iter.next();
				result.add(element);
			}
			step++;

		}
		array.clear();
		array = result;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((array == null) ? 0 : array.hashCode());
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
		NumbersStorage other = (NumbersStorage) obj;
		if (array == null) {
			if (other.array != null)
				return false;
		} else if (!array.equals(other.array))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NumbersStorage [array=" + array + "]";
	}

}
