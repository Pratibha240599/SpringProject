package com.java.programs;

import java.util.*;

public class Multiplication {
	
	public static void main(String[] args) {
		int n;
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		/*
		 * for(i=1;i<=10;i++) { //int x = i*n; //System.out.println(x);
		 * System.out.format("%d X %d = %d", n, i, n*i); System.out.println(); }
		 */
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
