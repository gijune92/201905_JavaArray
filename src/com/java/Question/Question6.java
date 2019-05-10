package com.java.Question;

import java.util.Random;
import java.util.Scanner;

public class Question6 {
	TetrisBlock tb = new TetrisBlock();
	boolean blockCheck = false;
	boolean Start = false;
	String keyVal = "";
	int direction_UpDown = 1;
	int direction_LeftRight = 4;
	int iRandomVal = 0;
	
	int[][] Map = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
			
	};
	
	public void Question5_Loop() {
		
		Question5_Routine("f");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			switch(sc.next().toUpperCase()) {
				case "S":
					keyVal = "S";
					break;
				
				case "A":
					keyVal = "A";
					break;
				
				case "D":
					keyVal = "D";
					break;
				
				default :
					break;
			}

			if(Question5_Routine(keyVal)) {
				
			}
			
		}
		
	}
	
	public boolean Question5_Routine(String keyVal) {
		Random ran = new Random();
		boolean res = false;
		for(int i = 0; i < Map.length; i++) {
			for(int j = 0; j < Map[i].length; j++) {
				
				if(i==1 & j ==4) {
					//Map[i][j] = tb.block2[0][][];
				}
				
				if(Map[i][j] == 0) {
					System.out.print(" ■ ");
				}else if(Map[i][j] == 1) {
					System.out.print(" □ ");
				}
			}
			System.out.println();
		}
		
		return res;
	}
}
