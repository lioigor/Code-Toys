package model;

import java.util.*;

/**
 * Service class for manipulating with text - finding characters that occur more
 * often than others.
 * 
 * @author Lio
 *
 */
public class FindCharactersThatFoundFrequently {

	/**
	 * Field storage of user text.
	 */
	private String textStorage = new String();

	/**
	 * Constructor for initialization storing text.
	 * 
	 * @param text
	 *            - text for manipulating.
	 */
	public FindCharactersThatFoundFrequently(String text) {

		textStorage = text;
	}

	/**
	 * Method for find character in the string, which occurs most often.
	 * 
	 * @param amountOfOutputSymbols
	 *            - number of characters to display.
	 * @return buffer representing data in the following order: character =
	 *         amount in text.
	 */
	public String find() {

		int max = 0;

		String inputText = new String(textStorage);

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		while (inputText.length() != 0) {
			int count = countCharacter(inputText, inputText.charAt(0));
			if (count > max) {
				max = count;
			}
			Character character = inputText.charAt(0);
			map.put(character, count);
			inputText = removeCharacters(inputText, inputText.charAt(0));
		}

		return entriesSortedByValues(map).toString();
	}

	/**
	 * Recursive method for count occurrence of the character in the
	 * StringBuilder.
	 * 
	 * @param string
	 *            - string for counting.
	 * @param c
	 *            - character that checking.
	 * @return count of occurrence.
	 */
	private int countCharacter(StringBuilder string, char c) {
		if (string.length() == 0)
			return 0;
		return (string.charAt(0) == c) ? 1 + countCharacter(string.delete(0, 1), c)
				: countCharacter(string.delete(0, 1), c);
	}

	/**
	 * Recursive method for count occurrence of the character in the String.
	 * 
	 * @param string
	 *            - string for counting.
	 * @param c
	 *            - character that checking.
	 * @return count of occurrence.
	 */
	private int countCharacter(String string, char c) {
		StringBuilder stringBuilder = new StringBuilder(string.subSequence(0, string.length()));
		return countCharacter(stringBuilder, c);
	}

	/**
	 * Recursively delete all occurrences of a character in the string.
	 * 
	 * @param string
	 *            - input string.
	 * @param c
	 *            - character that need to delete.
	 * @return new string without parameter c.
	 */
	private String removeCharacters(String string, char c) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != c)
				stringBuilder.append(string.charAt(i));
		}
		return stringBuilder.toString();
	}

	/**
	 * Here's a generic method that returns a SortedSet of Map.Entry, given a
	 * Map whose values are Comparable.
	 * 
	 * @param map
	 *            - our Map.Entry for sorting.
	 * @return - Sorted Set by values.
	 */
	private static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(
			Map<K, V> map) {
		SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
				int res = e1.getValue().compareTo(e2.getValue());
				return res != 0 ? res : 1;
			}
		});
		sortedEntries.addAll(map.entrySet());
		return sortedEntries;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((textStorage == null) ? 0 : textStorage.hashCode());
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
		FindCharactersThatFoundFrequently other = (FindCharactersThatFoundFrequently) obj;
		if (textStorage == null) {
			if (other.textStorage != null)
				return false;
		} else if (!textStorage.equals(other.textStorage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FindCharactersThatFoundFrequently [textStorage=" + textStorage + "]";
	}

}
