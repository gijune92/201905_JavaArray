package com.java.Question;

import java.util.Scanner;

public class Question8 {

	
	boolean W_Flag, S_Flag, A_Flag, D_Flag = false;
	boolean Move_Flag = false;
	int Key_Code;
	int[][] Map =
			{
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
			{1, 0, 0, 0, 2, 0, 1, 2, 0, 1},
			{1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
			{1, 0, 0, 1, 0, 1, 1, 0, 0, 1},
			{1, 0, 2, 0, 0, 1, 1, 0, 0, 1},
			{1, 0, 2, 1, 0, 1, 1, 0, 0, 1},
			{1, 0, 0, 0, 2, 0, 0, 2, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};

	public void Question8_Loop() {
		Scanner sc = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		
		Question8_Routine(aX, aY, bX, bY);
		
		while(true) {
			switch (sc.nextLine().toUpperCase()) {
			case "W" : 
				W_Flag = true;
				aX--;
				break;
				
			case "S" :
				S_Flag = true;
				aX++;
				break;
				
			case "A" :
				A_Flag = true;
				aY--;
				break;
				
			case "D" :
				D_Flag = true;
				aY++;
				break;
				
			default :
				break;
			
			}
			System.out.println("Loop : " + aY + ", " + aX + ", " + bY + ", " + bX);
			if(Question8_Routine(aX, aY, bX, bY)) {
				break;
			}
			
			if(Move_Flag) {
				aX = bX;
				aY = bY;
				Move_Flag = false;
			}else {
				bX = aX;
				bY = aY;
			}
		}
		sc.close();
	}
	
	public boolean Question8_Routine(int aX, int aY, int bX, int bY) {
		boolean res = false;
		System.out.println("Routine : " + aY + ", " + aX + ", " + bY + ", " + bX);

		// 벽 예외처리
		if(Map[aX][aY] == 1) {
			Move_Flag = true;
			aX = bX;
			aY = bY;
		}
		
		// 옮길 블럭 처리
		if(Map[aX][aY] == 2) { // 이동할 위치가 옴길 블럭 체크
			// 이 시점에 나는 이미 움직일 곳을 가리키고 있기 때문에, 다음 블럭이 하트인지 벽인지 체크하는 부분
			if(W_Flag) {
				if(Map[aX-1][aY] == 2 || Map[aX-1][aY] == 1) { 
					// 옴길 블럭에 옆에 위치가 벽인지, 또다른 하트가 있는지 체크
					System.out.println("asdsadasdasdasd");
					aX = bX;
					aY = bY;
					Move_Flag = true;
				}else {
					Map[aX-1][aY] = 2;
					Map[aX][aY] = 0;
				}
			}else if (S_Flag) {
				if(Map[aX+1][aY] == 2 || Map[aX+1][aY] == 1) {
					aX = bX;
					aY = bY;
					Move_Flag = true;	
				}else {
					Map[aX+1][aY] = 2;
					Map[aX][aY] = 0;
				}
			}else if (A_Flag) {
				if(Map[aX][aY-1] == 2 || Map[aX][aY-1] == 1) {
					aX = bX;
					aY = bY;
					Move_Flag = true;
				}else {
					Map[aX][aY-1] = 2;
					Map[aX][aY] = 0;
				}
			}else if (D_Flag) {
				if(Map[aX][aY+1] == 2 || Map[aX][aY+1] == 1) {
					aX = bX;
					aY = bY;
					Move_Flag = true;
				}else {
					Map[aX][aY+1] = 2;
					Map[aX][aY] = 0;
				}
			}
		}

		// 맵출력
		for(int i = 0; i < Map.length; i++) {
			for(int j = 0; j < Map[i].length; j++) {
				
				if(i == aX && j == aY) {
					System.out.print(" ㉿ ");
				}
				else if(Map[i][j] == 0) {
					System.out.print(" □ ");
				}
				else if(Map[i][j] == 2) {
					System.out.print(" ♥ ");
				}
				else if(Map[i][j] == 1) {
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		
		// 처리 후 Flag 초기화
		W_Flag = false;	S_Flag = false;	A_Flag = false;	D_Flag = false;
		
		// 종료 조건
		if(Map[3][3] == 2 && Map[3][5] == 2 && Map[4][4] == 2 && Map[5][3] == 2 && Map[5][4] == 2 && Map[6][4] == 2) {
			System.out.println("게임 종료");
			res = true;
		}

		return res;
	}
}
