package com.java.Question;

import java.util.Scanner;

public class Question7 {

	public void Question7_Loop() {
		int aX = 0;
		int aY = 0;
		int bX = 0;
		int bY = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Question_Routine(aX, aY, bX, bY);
		while(true) {
			
			switch (sc.next().toUpperCase()) {
				case "W" : 
					aX--;
					break;
				case "S" :
					aX++;
					break;
				case "A" :
					aY--;
					break;
				case "D" :
					aY++;
					break;
					
				default :
					break;
			}
			
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(Question_Routine(aX, aY, bX, bY)) {
				System.out.println("게임종료");
				break;
			}
			
			if((aX < 0 || aY < 0) || (aX > 4 || aY > 4)) {
				aX = bX;
				aY = bY;  
			}else {
				bX = aX;
				bY = aY;
			}
			
			
		}
		
		sc.close();
	}
	
	public boolean Question_Routine(int aX, int aY, int bX, int bY) {
		boolean res = false;
		
		int[][] Map = {
				{0,0,0,0,0},
				{0,0,1,0,0},
				{0,1,3,1,0},
				{0,0,1,0,0},
				{0,0,0,0,0}
		};

		for(int i = 0; i < Map.length; i++) {
			for(int j = 0; j < Map[i].length; j++) {

				if((aX < 0 || aY < 0) || (aX > 4 || aY > 4)) {
					aX = bX;
					aY = bY;  
				}else {
					bX = aX;
					bY = aY;
				}
					
				
				if(i == aX && j == aY) {
					System.out.print(" ㉿ ");
				}
				else if(Map[i][j] == 0) {
					System.out.print(" □ ");
				}
				else if(Map[i][j] == 1) {
					System.out.print(" ■ ");
				}
				else if(Map[i][j] == 3) {
					System.out.print(" ♥ ");
				}
			}
			System.out.println();
		}
		if(aX == 2 & aY == 2) {
			res = true;
		}
		
		return res;
	}
	
}
