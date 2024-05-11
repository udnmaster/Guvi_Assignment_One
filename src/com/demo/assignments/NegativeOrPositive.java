package com.demo.assignments;

import java.util.*;

public class NegativeOrPositive {

	public static void main(String[] args) {
		try {// TODO Auto-generated method stub
			int num = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a number = ");
			num = s.nextInt();
			s.close();
			if (num > 0) {
				System.out.println("Entered number is positive " + num);
			} else if (num < 0) {
				System.out.println("Entered number is negative " + num);
			} 
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
