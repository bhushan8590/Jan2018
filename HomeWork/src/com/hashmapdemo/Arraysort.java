package com.hashmapdemo;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		int[] array = {21,45,89,78,12,65,89,75,36,56};
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	 
}
