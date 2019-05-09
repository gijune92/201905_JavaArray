package com.java.Question;

public class Test {
	public void a () {
		int[][] aa = {
				{0,0,0,0,0},	
				{1,1,1,1,1},
				{2,2,2,2,2},
				{3,3,3,3,3}
		};
		int[][] bb= {
				{5,5,5,5,5},	
				{4,4,4,4,4},
				{3,3,3,3,3},
				{2,2,2,2,2}
		};
		
		System.out.println("asdasdasdasd");

		for(int i = 3; i >= 0; i--) {
			for(int j = 0; j <= bb[i].length; j++) {
				System.out.println(aa[i][j] +"   " + bb[i][j]);
			}
			System.out.println("Asdasdasd");
		}
		for(int i = 3; i > 0; i--) {
			for(int j = 0; j < bb[i].length; j++) {
				aa[i][j] = bb[i][j];
			}
		}
		
		for(int i = 3; i >= 0; i--) {
			for(int j = 0; j <= bb[i].length; j++) {
				System.out.println(aa[i][j] +"   " + bb[i][j]);
			}
			System.out.println("Asdasdasd");
		}
		
		
		
	}
}
