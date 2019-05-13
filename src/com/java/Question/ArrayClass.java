package com.java.Question;

public class ArrayClass {

	int[][] Array = new int[10][10];
	
	int[][] Array2 = {
			{2,4},
			{2,7},
			{5,2},
			{6,2},
			{7,4},
			{7,7}
	};
	
	public void Array_Print() {
		
		System.out.println("Array");
		for(int i = 0; i < Array.length; i++) {
			for(int j = 0; j < Array[i].length; j++){
				System.out.print("  Array["+i+"]["+j+"]  =  " + Array[i][j]);
			}
			System.out.println();
		}
		
		
		
		System.out.println("Array2             ");
		for(int i = 0; i < Array2.length; i++) {
			for(int j = 0; j < Array2[i].length; j++){
				System.out.print("  Array2["+i+"]["+j+"]   =   " + Array2[i][j]);
			}
			System.out.println();
		}	
		
		
		for(int i = 0; i < Array2.length; i++) {
			Array[Array2[i][0]][Array2[i][1]] = 2;
		}

		System.out.println("Array Value in");
		for(int i = 0; i < Array.length; i++) {
			for(int j = 0; j < Array[i].length; j++){
				System.out.print("  Array["+i+"]["+j+"]  =  " + Array[i][j]);
			}
			System.out.println();
		}

		
		
	}
	
	
}
