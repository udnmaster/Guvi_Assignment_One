package com.demo.assignments;

import java.util.*;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int n1, n2, n3;
			System.out.println("Enter three numbers: ");
			Scanner s = new Scanner(System.in);
			
			n1 = s.nextInt();
			n2 = s.nextInt();
			n3 = s.nextInt();
			s.close();
			if (n1 < n2 && n1 < n3)
				System.out.println("The smallest number is: " + n1);
			else if (n2 < n1 && n2 < n3)
				System.out.println("The smallest number is: " + n2);
			else if (n3 < n1 && n3 < n2)
				System.out.println("The smallest number is: " + n3);
			else
				System.out.println("The numbers are same.");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
