package com.java.programs;
import java.util.Arrays;
public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = new int [] {1, 2, 3, 4, 5};
	    //n determine the number of times an array should be rotated
	    int n = 3;
	    //Displays original array
	    System.out.println("Original array: ");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    //Rotate the given array by n times toward left
	    for(int i = 0; i < n; i++){
	        //Stores the first element of the array
	        int first = arr[0];
	        for(int j = 0; j < arr.length-1; j++){
	            //Shift element of array by one
	            arr[j] = arr[j+1];
	        }
	        //First element of array will be added to the end
	        arr[j] = first;
	    }
	    System.out.println();
	    //Displays resulting array after rotation
	    System.out.println("Array after left rotation: ");
	    for(int i = 0; i< arr.length; i++){
	        System.out.print(arr[i] + " ");
	    }


}

}	
