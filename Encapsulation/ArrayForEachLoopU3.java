package com.company.encapsulation;

public class ArrayForEachLoopU3 {

	public static void main(String[] args) {
		
		int[] arr = {4, 7 , 8, 49, 30};
		
//		System.out.println("For printing the array elements");
//		for(int a : arr) {
//			System.out.println(a);		}
//	    }
		
//	    System.out.println("For printing the even values");
//	    for(int a : arr) {
//	    	if(a % 2 ==0)
//		System.out.println(a);		}
//        }
		
//        System.out.println("For printing the even index values");
//        int index = 0;
//        for(int a : arr) {
//        	if(index % 2 ==0)
//	         System.out.println(a);	
//           index ++;	
//        }
//        }
	
	 System.out.println("For printing the values from backward direction using forEach loop");
     int x = arr.length - 1;
     for(int a : arr) {
	         System.out.println(arr[x]);	
        x --;	
     }
     }

}
