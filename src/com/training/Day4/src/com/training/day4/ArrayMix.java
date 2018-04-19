package com.training.day4;

public class ArrayMix {

	public static <E> void printArray(E[] array) {
		for (E element : array)
			System.out.println(element);
	}

	public static void main(String[] args) {
		printArray(new Integer[] { 1, 2, 3 });
		printArray(new String[] { "Hello", "World" });
	}
}