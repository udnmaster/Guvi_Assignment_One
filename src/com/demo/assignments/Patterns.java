package com.demo.assignments;
import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i,j,col,row;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter a row number=");
			row=s.nextInt();
			System.out.print("Enter a column number=");
			col=s.nextInt();
			for(i=1;i<=row;i++) {
				for(j=col;j>col-i;j--) {
					System.out.print(j);
				}
				for(j=1;j<=col-i;j++) {
					System.out.print(row -i+1);
				}
				System.out.println();
			}

		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
