package com.demo.assignments;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int en, dummy = 0, temp;
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("Enter a number= ");
			en = s.nextInt();
			s.close();
			while (en != 0) {
				temp = en % 10;
				dummy = dummy * 10 + temp;
				en = en / 10;

			}
			System.out.println("Reversed number is " + dummy);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
