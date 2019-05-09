package com.java.Question;

import java.util.Scanner;

public class Question3 {
	boolean res = false;
	boolean Start_Flag = false;
	boolean Crush_Flag = false;
	int RefreshMap_Count = 0;
	int[][] Map = {
			/*
			{3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
			{3, 0, 1, 1, 1, 1, 1, 1, 1, 3 },
			{3, 1, 1, 1, 1, 0, 1, 1, 0, 3 },
			{3, 1, 1, 0, 1, 1, 1, 0, 0, 3 },
			{3, 0, 1, 1, 1, 1, 1, 1, 1, 3 },
			{3, 1, 1, 1, 1, 0, 1, 1, 0, 3 },
			{3, 1, 1, 0, 1, 1, 1, 0, 0, 3 },
			{3, 0, 1, 1, 1, 1, 1, 1, 1, 3 },
			{3, 1, 1, 1, 1, 1, 1, 1, 1, 3 },
			{3, 3, 3, 3, 3, 3, 3, 3, 3, 3 }
			*/
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
			{0, 1, 1, 1, 1, 0, 1, 1, 0, 0 },
			{0, 1, 1, 0, 1, 1, 1, 0, 0, 0 },
			{0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
			{0, 1, 1, 1, 1, 0, 1, 1, 0, 0 },
			{0, 1, 1, 0, 1, 1, 1, 0, 0, 0 },
			{0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			
	};
	
	public boolean Question3_Routine(int aX, int aY, int bX, int bY) {
		res = false;
		
		int[][] RefreshMap = {

				{0, 1, 1, 1, 1, 0, 1, 1, 0, 0 },
				{0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
				{0, 1, 1, 1, 1, 0, 1, 1, 0, 0 },
				{0, 1, 1, 0, 1, 1, 1, 0, 0, 0 },
				{0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
				{0, 1, 1, 1, 1, 0, 1, 1, 0, 0 },
				{0, 1, 1, 0, 1, 1, 1, 0, 0, 0 },
				{0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
				{0, 1, 1, 1, 1, 0, 1, 1, 0, 0 },
				{0, 1, 1, 0, 1, 1, 1, 0, 0, 0 }
		};
		
			/*
			for(int i = 7; i > 0; i--) {
				Map[i+1] = Map[i];
			}
			*/
			Map[8] = Map[7];
			Map[7] = Map[6];
			Map[6] = Map[5];
			Map[5] = Map[4];
			Map[4] = Map[3];
			Map[3] = Map[2];
			Map[2] = Map[1];
			Map[1] = RefreshMap[RefreshMap_Count];
			RefreshMap_Count++;
		
		
		
		for(int i = 0; i < Map.length; i++ ) {
			for(int j = 0; j < Map[i].length; j++) {
				
				if(Map[aY][aX] == 0 ) {
					Crush_Flag = true;
				}
				
				if(aX == j && aY == i) {
					System.out.print(" ㉿ ");
				}
				else if(Map[i][j] == 0) {
					System.out.print(" ■ ");
				}else if( Map[i][j] == 1) {
					System.out.print(" □ ");
				}

			}
			System.out.println();
		}
		
		return res; 
	}
	public void Question3_Loop() {
		Scanner sc = new Scanner(System.in);
		int aX = 4;
		int aY = 8;
		int bX = 4;
		int bY = 8;
		String input = "";
		
		Question3_Routine(aX, aY, bX, bY);
		while(true) {
			input = sc.next();
			switch (input.toUpperCase()) {
				case "A" :
					aX--;
					break;
				case "S" :
					aX = aX;
					break;
				case "D" :
					aX++;
					break;
				default :
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX + "      RefreshMap_Count : " + RefreshMap_Count);
			
			if(Question3_Routine(aX, aY, bX, bY)){
				aX = bX;
				aY = bY;
			}else {
				Start_Flag = true;
				
			}

			if(RefreshMap_Count == 9 ) {
				System.out.println("게임 종료");
				break;
			}else if( Crush_Flag == true) {
				System.out.println("게임 종료");
				break;
			}
			
		}
	}
}
