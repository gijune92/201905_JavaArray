package com.java.Question;

import java.util.Scanner;

public class Question1 {
	int Game_flag = 0;
	boolean GameCount1 = false;
	boolean GameCount2 = false;
	
	public boolean Question1_Routine(int aX, int aY, int bX, int bY) {
		boolean res = false;
		int[][] Map = {
				{0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,0,0,0,1,1,1,0,0,9,0},
				{0,1,1,1,1,1,0,1,1,1,1,0},
				{0,0,0,1,0,1,0,0,0,1,0,0},
				{0,8,0,1,0,1,0,1,0,1,1,0},
				{0,1,0,1,0,1,0,1,0,1,0,0},
				{0,1,1,1,1,1,0,1,1,1,0,0},
				{0,0,1,0,0,1,0,0,0,1,0,0},
				{0,0,1,0,1,1,1,0,1,1,1,0},
				{0,0,1,0,1,0,1,1,1,1,0,0},
				{0,0,1,1,1,0,0,0,0,1,7,0},
				{0,0,0,0,0,0,0,0,0,0,0,0},	
				};
		
		for(int i = 0; i < Map.length; i++) { // 행
			for(int j = 0; j < Map[i].length; j++) {	// 열
				
				if(Map[aY][aX] == 0) {
					aY = bY; 
					aX = bX;
					Game_flag = 1;
					res = true;
				}else if(Map[aY][aX] == 8) {
					GameCount1 = true;
				}
				else if(Map[aY][aX] == 9) {
					GameCount2 = true;
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
				else if(Map[i][j] == 8 || Map[i][j] == 9) {
					System.out.print(" X ");
				}
				else if(Map[i][j] == 7) {
					System.out.print(" G ");
				}
			}
			System.out.println();
		}
		
		return false;
	}
	
	public void Question1_Loop() {
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		
		boolean res ;
		
		Scanner scan = new Scanner(System.in);
		
		Question1_Routine(aX, aY, bX, bY);
		while(true) {
			String input = scan.next();
			switch (input.toUpperCase()) {
				case "W": // 위쪽
					aY--;
					break;
				case "S": // 아래쪽
					aY++;
					break;
				case "A": // 왼쪽
					aX--;
					break;
				case "D": // 오른쪽
					aX++;
					break;
				default:
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			
			Question1_Routine(aX, aY, bX, bY);
			
			if(Game_flag == 1) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
				System.out.println("이동할 수 없는 위치 입니다.");

			}else {
				bX = aX;
				bY = aY;
			}
			
			// 종료 부분!
			if((aX == 10 && aY == 10) && GameCount1 && GameCount2) {
				System.out.println("종료");
				break;
				
			}else if((aX == 10 && aY == 10)){
				if((!GameCount1) || (!GameCount2)) {
					System.out.println("보물을 다 찾지 않았습니다.");
					GameCount1 = false;
					GameCount2 = false;
					Question1_Loop();
					
				}
			}
		}
	}

}
