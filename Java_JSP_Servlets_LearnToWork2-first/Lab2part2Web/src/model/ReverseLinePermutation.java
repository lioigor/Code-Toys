package model;

import java.util.Stack;

/**
 * Service class for manipulating with text line: reverse line.
 * 
 * @author Lio
 *
 */
public class ReverseLinePermutation {
	/**
	 * Storage of line
	 */
	private String lineStorage;

	/**
	 * Constructor for initialization storage.
	 * 
	 * @param line
	 */
	public ReverseLinePermutation(String line) {

		lineStorage = new String(line);

	}

	/**
	 * Method that reverse line by array help.
	 * 
	 * @return new reversed line.
	 */
	public String reverseByArray() {
		char[] a = lineStorage.toCharArray();
		char[] b = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			b[(a.length - 1) - i] = a[i];
		}
		return new String(b);
	}

	/**
	 * Method that reverse line by StringBuilder help.
	 * 
	 * @return new reversed line.
	 */
	public String reverseByStringBuilder() {
		return new StringBuilder(lineStorage).reverse().toString();
	}

	/**
	 * Method that reverse line by stack help.
	 * 
	 * @return new reversed line
	 */
	public String reverseByStack() {
		Stack<Character> st = new Stack<Character>();
		for (Character character : lineStorage.toCharArray()) {
			st.add(character);
		}
		StringBuilder sb = new StringBuilder();
		while (st.size() > 0) {
			sb.append(st.pop());
		}
		return sb.toString();
	}

	/**
	 * Example static method that reverse line by recursion method.
	 * 
	 * @param line
	 *            - line for reverse.
	 * @param posit
	 *            - position character in line for start to reverse.
	 * @return new reversed line.
	 */
	public static String reverseRecursion(String line, int posit) {

		if (posit != line.length() / 2) {
			char[] word = line.toCharArray();
			char c = word[posit];
			word[posit] = word[line.length() - 1 - posit];
			word[line.length() - 1 - posit] = c;
			return reverseRecursion(new String(word), ++posit);
		} else {
			return line;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineStorage == null) ? 0 : lineStorage.hashCode());
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
		ReverseLinePermutation other = (ReverseLinePermutation) obj;
		if (lineStorage == null) {
			if (other.lineStorage != null)
				return false;
		} else if (!lineStorage.equals(other.lineStorage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReverseLinePermutation [lineStorage=" + lineStorage + "]";
	}

}
