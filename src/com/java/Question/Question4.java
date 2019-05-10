package com.java.Question;

import java.util.Scanner;

public class Question4 {
	int Map[][] = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,2,0,0,1,1,0,1,0},
			{0,1,1,2,0,1,0,1,1,0},
			{0,1,1,0,2,1,1,0,1,0},
			{0,1,1,0,1,2,0,1,1,0},
			{0,1,0,1,1,0,2,1,1,0},
			{0,1,0,1,0,0,1,2,1,0},
			{0,1,1,1,1,1,1,0,1,0},
			{0,0,0,0,0,0,0,0,0,0},	
	};
	int iHeartCount = 0;
	
	public void Question4_Loop() {
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		
		Scanner sc = new Scanner(System.in);
		Question4_Routine(aX, aY, bX, bY);
		
		
		while(true) {
			switch(sc.next().toUpperCase()) {
				case "W":
					aY--;
					break;
				
				case "S":
					aY++;
					break;
				
				case "A":
					aX--;
					break;
				
				case "D":
					aX++;
					break;
				
				default :
					break;

									
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(Question4_Routine(aX, aY, bX, bY)) {
				aX = bX;
				aY = bY;
			}else {
				bX = aX;
				bY = aY;
			}
		
			if(iHeartCount == 6 && (aX ==8 && aY == 8)) {
				System.out.println("게임종료");
				break;
			}
			else if(aX ==8 && aY == 8) {
				System.out.println("하트를 다 모으지 못했습니다. 남은 하트 갯수 :" + (6-iHeartCount));
				aX = 1;
				aY = 1;
			}

		}
		
	}
	
	public boolean Question4_Routine(int aX, int aY, int bX, int bY) {
		boolean res = false;
		
		for(int i = 0; i < Map.length; i++) {
			for(int j = 0; j < Map[i].length; j++) {
				
				if(Map[aY][aX] == 0) {
					aX = bX;
					aY = bY;
					res = true;
				}
				else if(Map[aY][aX] == 2) {
					Map[aY][aX] = 1;
					iHeartCount++;
				}
				
				
				if(i == aY && j == aX) {
					System.out.print(" ㉿ ");
				}else if(Map[i][j] == 0) {
					System.out.print(" ■ ");
				}else if(Map[i][j] == 1) {
					System.out.print(" □ ");
				}else if(Map[i][j] == 2) {
					System.out.print(" ♥ ");
				}
			}
			System.out.println("");
		}
		
		return res;
				
	}
}
