package com.java.Question;

import java.util.Scanner;

public class Question2 {
	boolean res = false;
	public boolean Question2_Loop() {
		int aY = 1;
		int aX = 1;
		int bY = 1;
		int bX = 1;
		Question2_Routine(aX, aY, bX, bY);
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.next();
			
			switch(input.toUpperCase()) {
			case "W" : 
				aY--;
				break;
			
			case "S" :
				aY++;
				break;
			
			case "A" :
				aX--;
				break;
			
			case "D" : 
				aX++;
				break;
			
			default : 
				break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(Question2_Routine(aX, aY, bX, bY)) {
				aY = bY;
				aX = bX;
				System.out.println("이동 ㄴㄴ함");
			}else {
				bY = aY;
				bX = aX;
			}
			

		}
	}
	public boolean Question2_Routine(int aX, int aY, int bX, int bY ) {
		int[][] Map = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 1, 0 }, 
				{ 0, 1, 1, 0, 3, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 2, 0 }, 
				{ 0, 1, 1, 1, 1, 1, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0 } 
			};
		res = false;
		for(int i = 0; i < Map.length; i++ ) {
			for(int j = 0; j < Map[i].length; j++) {
			
				if(Map[aY][aX] == 0) {
					aY = bY;
					aX = bX;
					res = true;
				}
				else {
					bX = aX;
					bY = aY;
				}


				
				if(i == aY && j == aX) {
					System.out.print(" ㉿ ");
				}
				else if(Map[i][j] == 0) {
					System.out.print(" ■ ");
				}
				else if(Map[i][j] == 1) {
					System.out.print(" □ ");
				}
				else if(Map[i][j] == 2) {
					System.out.print(" X ");
				}
				else if(Map[i][j] == 3) {
					System.out.print(" O ");
				}
			}
			System.out.println("");
		}
		return res;
	}
}
