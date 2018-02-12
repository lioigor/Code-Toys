package model;

public class ReverseLinePermutationTest {

	public static void main(String[] args) {

		ReverseLinePermutation rlp = new ReverseLinePermutation("hello nigers");

		System.out.println("reverseByArray:         " + rlp.reverseByArray());
		System.out.println("reverseByStack:         " + rlp.reverseByStack());
		System.out.println("reverseByStringBuilder: " + rlp.reverseByStringBuilder());
		System.out.println("reverseByRecursion:     " + rlp.reverseRecursion("hello nigers", 0));

	}

}
