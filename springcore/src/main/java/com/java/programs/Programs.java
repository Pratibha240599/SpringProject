package com.java.programs;

public class Programs {

	public static void main(String[] args) {
		/*Java program to print third highest element
        note:- if you want to print largest element then set a[total-1]
        note:- if you want to print smallest element then set a[0]
        int arr[] = new int[]{1,2,5,6,3};
        int a = getThirdLargest(arr,5);
         */

        /*-------Java Program to sort the elements of an array in ascending order
        //Initialize array
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
         */

        /*--Program to print the largest element in an array
        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
         */

        /*---Program to print the duplicate elements of an array
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
         */

        /*--------Java program to left rotate of array element
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
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
         */

        /*-----------Program to copy all elements of one array into another array
        //Initialize array
        int [] arr1 = new int [] {1, 2, 3, 4, 5};
        //Create another array arr2 with size of arr1
        int arr2[] = new int[arr1.length];
        //Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

         */

        /*Java Program to Display Even Numbers From 1 to 100
        int number=100;
        System.out.print("List of even numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
            //logic to check if the number is even or not
            //if i%2 is equal to zero, the number is even
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
            }
         */


        /* Java Program to calculate Armstrong number.....
        int number = 371, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
         */


        //System.out.println(removeWhiteSpaces("S DSS"));


		/*--Java Program to count the number of words in a string using HashMap
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
        --*/

        /*---Java program swap two number without using third variable
        int x, y;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
         */

        /*---Java program to swap two number using third variable
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping" + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping" + x + y);
        --------*/

        /*--Java program to reverse of string
        String str = "123";
        System.out.println(reverse(str));
        */

        /*--Java program to check if number is prime
        System.out.println(isPrime(7));
         */

        /*Java program to print fibonacci sequence
        int seqLength = 10;
        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
        for (int i = 0; i < seqLength; i++) {
            System.out.print(fibonacci(i) + " ");
         }
        printFibonacciSequence(10);
         */

        /*--Java program to check if list contains only odd numbers
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(2);
        System.out.println(onlyOddNumbers(l1));
        */

        /*--Java program to check if string is palindrome
        System.out.println(checkPalindromeString("SAAS"));
         */

        /*--Java program to find second highest number
        System.out.println(findSecondHighest(new int[]{1,1,1,6}));
         */

        /*
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
         */

        /*---Java program to find square root of a number
        double d = squareRoot(16);
        System.out.println(d);
         */

    }

    public static int getThirdLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-3];
    }

    public static double squareRoot(int num)
    {
        //temporary variable
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }


    /*........Reverse a string.....*/
    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }

    /*.......check if number is prime......*/
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    /*.......check if number is prime......*/
    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }

    /*--check if list containts only odd numbers--*/
    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }

    /*----to find factorial of given number----*/
    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    /*---find second highest number-----*/
    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }


    public static boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for(char c : charArray) {

            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }


	}

