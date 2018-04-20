package com.training.day4;

public class ArrayMix {

	public static <E> void printArray(final E[] array) {
		for (final E elem : array)
			System.out.println(elem);
	}

	public static void main(final String[] args) {
		printArray(new Integer[] { 1, 2, 3 });
		printArray(new String[] { "Hello", "World" });
	}
}