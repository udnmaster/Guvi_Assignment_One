package com.demo.assignments;

import java.util.*;

public class ForAndWhileLoop {
	int i;
	Scanner s = new Scanner(System.in);

	public void forLoop(int i1, int j1) {

		System.out.print("Enter a start value (for loop)= ");
		i1 = s.nextInt();
		System.out.print("Enter a end value (for loop)= ");
		j1 = s.nextInt();
		for (i = i1; i <= j1; i++) {
			System.out.println(i);
		}

	}

	public void whileLoop(int i2, int j2) {

		System.out.print("Enter a start value (while loop)= ");
		i2 = s.nextInt();
		System.out.print("Enter a end value (while loop)= ");
		j2 = s.nextInt();
		s.close();
		while (i2 <= j2) {
			System.out.println(i2);
			i2++;
		}

	}

	public static void main(String[] args) {

		ForAndWhileLoop forWhileLoop = new ForAndWhileLoop();
		int i1 = 0, j1 = 0, i2 = 0, j2 = 0;

		try {
			forWhileLoop.forLoop(i1, j1);
			forWhileLoop.whileLoop(i2, j2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter a valid input to perform " + e);
		}

	}

}
