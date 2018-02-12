package lio.model;

import java.util.*;

public class SearchNumbers {

	private ArrayList<Integer> array;

	public SearchNumbers() {
		this.array = new ArrayList<Integer>();
	}

	public SearchNumbers(ArrayList<Integer> array) {

		this.array = new ArrayList<Integer>();
		this.array.addAll(array);
	}

	public void initArray(ArrayList<Integer> array) {
		this.array.addAll(array);
	}

	public void setArray(ArrayList<Integer> array) {
		this.array.removeAll(this.array);
		initArray(array);
	}

	public void addElement(int arg) {
		array.add(arg);
	}

	public void removeElement(int arg) {
		array.remove(arg);
	}

	public ArrayList<Integer> getArray() {
		return array;
	}

	public ArrayList<Integer> findNumToNewArray() {

		ArrayList<Integer> result = new ArrayList<Integer>();

		Iterator<Integer> iter = array.iterator();
		while (iter.hasNext()) {
			int element = iter.next();
			double a = element % 3;
			double b = element % 9;

			if ((a == 0) && (b == 0)) {
				result.add(element);
			} else if ((a == 0) && (b != 0)) {
				result.add(element);
			} else if ((a != 0) && (b == 0))
				result.add(element);
		}
		
		return result;
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
		SearchNumbers other = (SearchNumbers) obj;
		if (array == null) {
			if (other.array != null)
				return false;
		} else if (!array.equals(other.array))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		StringBuilder strbul  = new StringBuilder();
	     Iterator<Integer> iter = array.iterator();
	     while(iter.hasNext())
	     {
	         strbul.append(iter.next());
	        if(iter.hasNext()){
	         strbul.append(",");
	        }
	     }
		return "SearchNumbers [array=" + strbul.toString() + "]";
	}
	

}
