package com.demo.assignments;

import java.util.*;

public class PurchaseAmount {
	public static void main(String[] args) {
		try {
			double purchaseAmount, discountAmount, totalAmount;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the purchase Amount =");
			purchaseAmount = s.nextDouble();
			s.close();
			if (purchaseAmount < 500) {
				System.out.println("No discount is applied for " + purchaseAmount);
			} else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
				System.out.println("10% discount is applied for " + purchaseAmount);
				discountAmount = purchaseAmount * 0.1;
				System.out.println("Discounted Amount is " + discountAmount);
				totalAmount = purchaseAmount - discountAmount;
				System.out.println("Total Amount After 10% discount is " + totalAmount);

			} else if (purchaseAmount > 1000) {
				System.out.println("20% discount is applied for " + purchaseAmount);
				discountAmount = purchaseAmount * 0.2;
				System.out.println("Discounted Amount is " + discountAmount);
				totalAmount = purchaseAmount - discountAmount;
				System.out.println("Total Amount After 20% discount is " + totalAmount);

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
