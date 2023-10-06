package com.java.programs;

import java.lang.Exception.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.*;

public class Reverse {
	/*
	 * public static String reverse(String in) throws IllegalArgumentException {
	 * if(in==null) { System.out.println("Null is not valid input"); } StringBuilder
	 * out = new StringBuilder(); char[] chars = in.toCharArray(); for(int
	 * i=chars.length-1;i>=0;i--) { out.append(chars[i]); } return out.toString(); }
	 */
	/*
	 * public static boolean checkPalindromeString(String input) { boolean result =
	 * true; int length = input.length();
	 * 
	 * for (int i = 0; i < length/2; i++) { if (input.charAt(i) !=
	 * input.charAt(length - i - 1)) { result = false; break; } }
	 * 
	 * return result; }
	 */
	/*
	 * public static String removeWhiteSpaces(String input) { StringBuilder output =
	 * new StringBuilder(); char[] chars = input.toCharArray(); for(char c : chars)
	 * { if(!Character.isWhitespace(c)) { output.append(c); } } return
	 * output.toString(); }
	 */

	/*
	 * public static long factorial(long n) { if(n==1) { return 1; } else { return
	 * (n*factorial(n-1)); } }
	 */
	/*
	 * public static boolean onlyOddNumbers(List<Integer> list) { for(int i : list)
	 * { if(i%2==0) { return false; } } return true; }
	 */

	/*
	 * private static int findSecondHighest(int[] array) { int highest =
	 * Integer.MIN_VALUE; int secondHighest = Integer.MIN_VALUE;
	 * 
	 * for (int i : array) { if (i > highest) { secondHighest = highest; highest =
	 * i; } else if (i > secondHighest) { secondHighest = i; }
	 * 
	 * } return secondHighest; }
	 */

	/*
	 * public static int fibonacci(int count) {
	 * 
	 * if(count<=1) { return count; } else { return fibonacci(count-1) +
	 * fibonacci(count-2); }
	 * 
	 * }
	 */

	/*
	 * public static boolean isPrime(int n) { if(n==0 || n==1) { return false; }
	 * if(n==2) { return true; } for(int i=2;i<=n/2;i++) { if(n%2==0) { return
	 * false; } } return true; }
	 */

	/*
	 * public static int getThirdLargest(int[] a, int total){ int temp; for (int i =
	 * 0; i < total; i++) { for (int j = i + 1; j < total; j++) { if (a[i] > a[j]) {
	 * temp = a[i]; a[i] = a[j]; a[j] = temp; } } } return a[total-3]; }
	 */

	/*
	 * public static double squareRoot(int num) { //temporary variable double t;
	 * double sqrtroot=num/2; do { t=sqrtroot; sqrtroot=(t+(num/t))/2; }
	 * while((t-sqrtroot)!= 0); return sqrtroot; }
	 */

	/*
	 * public static int wordcount(String string) { int count=0;
	 * 
	 * char ch[]= new char[string.length()]; for(int i=0;i<string.length();i++) {
	 * ch[i]= string.charAt(i); if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) ||
	 * ((ch[0]!=' ')&&(i==0)) ) count++; } return count; }
	 */

	/*
	 * public static void main(String[] args) { int[] array = { 1, 2, 3, 4, 5, 6, 7
	 * }; Random rand = new Random(); for (int i = 0; i < array.length; i++) { int
	 * randomIndexToSwap = rand.nextInt(array.length); int temp =
	 * array[randomIndexToSwap]; array[randomIndexToSwap] = array[i]; array[i] =
	 * temp; } System.out.println(Arrays.toString(array));
	 * 
	 * 
	 * String str = "This this is is done by Saket Saket"; String[] split =
	 * str.split(" "); HashMap<String,Integer> map = new HashMap<String,Integer>();
	 * for (int i=0; i<split.length; i++) { if (map.containsKey(split[i])) { int
	 * count = map.get(split[i]); map.put(split[i], count+1); } else {
	 * map.put(split[i], 1); } } System.out.println(map);
	 * 
	 * }
	 */
	/*
	 * int n=153,arm=0,rem,c; c=n; while(n>0) { rem=n%10; arm=(int) (Math.pow(rem,
	 * 3)+arm); n=n/10; } if(c==arm) { System.out.println("Armstrong Number"); }
	 * else { System.out.println("Not Armstrong Number"); }
	 */
	// String string ="India Is My Country";
	// int a[] = {1,2,5,6,3,2};
	/*
	 * List<Integer> list1 = new ArrayList<Integer>(); list1.add(1); list1.add(3);
	 * list1.add(5); list1.add(7); list1.add(9); //list1.add(2);
	 */
	/*
	 * int count=4; int a=0; int b=1; int c=1;
	 * 
	 * for(int i=1;i<=count;i++) { System.out.print(a + ","); a=b; b=c; c=a+b; }
	 */

	// System.out.println(Reverse.wordcount(string) + " words.");

	public static void main(String[] args) throws InterruptedException {
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);

	}
}
	
	class Temp {
		public String toString()
		{
			return "temp";
		}
		public void finalize()
		{
			System.out.println("finalize method called");
		}
	}

