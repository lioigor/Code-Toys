package com.lioigor22.model;

import java.util.ArrayList;
import java.util.Iterator;

public class StringStorage {

	private ArrayList<String> text;
	private String deleteString;

	public StringStorage() {

		text = new ArrayList<String>();
		deleteString = "no delete string";
	}

	public StringStorage(ArrayList<String> text, String deleteString) {

		this.text = new ArrayList<String>(text);
		this.deleteString = deleteString;
	}

	public void setText(ArrayList<String> text) {

		this.text.clear();
		this.text = text;
	}

	public ArrayList<String> getText() {
		return text;
	}

	public void addLine(String line) {

		text.add(line);
	}

	public void removeLine(String line) {

		text.remove(line);
	}

	public String getDeleteString() {
		return deleteString;
	}

	public void setDeleteString(String deleteString) {
		this.deleteString = deleteString;
	}

	public void removeDeleteString() {

		ArrayList<String> result = new ArrayList<String>();

		Iterator<String> iter = text.iterator();
		while (iter.hasNext()) {
			String line = iter.next();
			String newstr = line.replaceAll(deleteString, "");
			result.add(newstr);
		}
		text.clear();
		text = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deleteString == null) ? 0 : deleteString.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		StringStorage other = (StringStorage) obj;
		if (deleteString == null) {
			if (other.deleteString != null)
				return false;
		} else if (!deleteString.equals(other.deleteString))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StringStorage [text=" + text + ", deleteString=" + deleteString + "]";
	}

}
