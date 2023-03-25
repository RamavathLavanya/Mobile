package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepetedElements {

	 public static void firstREpeatedElement(int arr[]){
	        int min = -1;
	        HashSet<Integer> set = new HashSet<>();
	        for (int i = arr.length - 1; i >= 0; i--) {
	            if (set.contains(arr[i]))
	                min = i;
	            else
	                set.add(arr[i]);
	        }
	        if (min != -1)
	            System.out.println("first repeating "+ arr[min]);
	        else
	            System.out.println("no repeating ");
	    }

	    public static void main(String[] args) {
	        Scanner sc= new Scanner (System.in);
	        int n= sc.nextInt();
	        int arr[]=new int [n];
	        for( int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        firstREpeatedElement(arr);
	    }
	    
	}

//static int printFirstRepeating(int arr[])
//{
//    int ans = -1;
//    HashSet<Integer> set = new HashSet<>();
//    for (int i = 0; i<arr.length; i++) {
//        if (set.contains(arr[i]))
//            { ans = arr[i];
//               break;
//            }
//        else
//            set.add(arr[i]);
//    }
//    return ans;
//    }
