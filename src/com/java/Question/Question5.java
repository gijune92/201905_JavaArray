package com.java.Question;

import java.util.Random;
import java.util.Scanner;

public class Question5 {
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
		if(keyVal.equals("f")) {
			
			if(!blockCheck) {
				iRandomVal = ran.nextInt(7);
				System.out.println(iRandomVal);
				//iRandomVal = 5;
				switch(iRandomVal) {
				case 1: 
					Map[direction_UpDown][direction_LeftRight] = tb.block[0][0][0];
					Map[direction_UpDown][direction_LeftRight+1] = tb.block[0][0][1];
					Map[direction_UpDown][direction_LeftRight+2] = tb.block[0][0][2];
					Map[direction_UpDown][direction_LeftRight+3] = tb.block[0][0][3];
					break;
				
				case 2:
					Map[direction_UpDown][direction_LeftRight] = tb.block[1][0][1];
					Map[direction_UpDown+1][direction_LeftRight-1] = tb.block[1][1][0];
					Map[direction_UpDown+1][direction_LeftRight] = tb.block[1][1][1];
					Map[direction_UpDown+2][direction_LeftRight-1] = tb.block[1][2][0];
					break;
				
				case 3:
					Map[direction_UpDown][direction_LeftRight] = tb.block[2][0][0];
					Map[direction_UpDown+1][direction_LeftRight] = tb.block[2][1][0];
					Map[direction_UpDown+1][direction_LeftRight+1] = tb.block[2][1][1];
					Map[direction_UpDown+2][direction_LeftRight+1] = tb.block[2][2][1];
					break;
				
				case 4: 
					Map[direction_UpDown][direction_LeftRight] = tb.block[3][0][0];
					Map[direction_UpDown][direction_LeftRight+1] = tb.block[3][0][1];
					Map[direction_UpDown][direction_LeftRight+2] = tb.block[3][0][2];
					Map[direction_UpDown+1][direction_LeftRight] = tb.block[3][1][0];
					break;
				
				case 5:
					Map[direction_UpDown][direction_LeftRight] = tb.block[4][0][0];
					Map[direction_UpDown][direction_LeftRight+1] = tb.block[4][0][1];
					Map[direction_UpDown][direction_LeftRight+2] = tb.block[4][0][2];
					Map[direction_UpDown+1][direction_LeftRight+2] = tb.block[4][1][2];
					break;
				
				case 6:
					Map[direction_UpDown][direction_LeftRight] = tb.block[5][0][0];
					Map[direction_UpDown][direction_LeftRight+1] = tb.block[5][0][1];
					Map[direction_UpDown+1][direction_LeftRight] = tb.block[5][1][0];
					Map[direction_UpDown+1][direction_LeftRight+1] = tb.block[5][1][1];
					break;
				
				case 7:
					Map[direction_UpDown][direction_LeftRight] = tb.block[6][0][1];
					Map[direction_UpDown+1][direction_LeftRight-1] = tb.block[6][1][0];
					Map[direction_UpDown+1][direction_LeftRight] = tb.block[6][1][1];
					Map[direction_UpDown+1][direction_LeftRight+1] = tb.block[6][1][2];
					break;
			
				default :
					break;
				}
				blockCheck = true;
			}
			else {
				if(keyVal.equals("S")) {
					if(Map[direction_UpDown+1][direction_LeftRight] != 0) {
						Map[direction_UpDown][direction_LeftRight] = 1;	
						Map[direction_UpDown][direction_LeftRight+1] = 1;	
						Map[direction_UpDown][direction_LeftRight+2] = 1;	
						Map[direction_UpDown][direction_LeftRight+3] = 1;
						
						Map[direction_UpDown+1][direction_LeftRight] = 0;	
						Map[direction_UpDown+1][direction_LeftRight+1] = 0;	
						Map[direction_UpDown+1][direction_LeftRight+2] = 0;	
						Map[direction_UpDown+1][direction_LeftRight+3] = 0;
						direction_UpDown++;
					}
					else {
						blockCheck = false;
					}
				}else if(keyVal.equals("A")) {
					if(Map[direction_UpDown][direction_LeftRight - 1] != 0 ||Map[direction_UpDown][direction_LeftRight + 1] != 0 ) {
						Map[direction_UpDown][direction_LeftRight] = 1;	
						Map[direction_UpDown][direction_LeftRight+1] = 1;	
						Map[direction_UpDown][direction_LeftRight+2] = 1;	
						Map[direction_UpDown][direction_LeftRight+3] = 1;
						direction_LeftRight--;
						
						Map[direction_UpDown][direction_LeftRight] = 0;
						Map[direction_UpDown][direction_LeftRight+1] = 0;
						Map[direction_UpDown][direction_LeftRight+2] = 0;
						Map[direction_UpDown][direction_LeftRight+3] = 0;
					}else if(Map[direction_UpDown+1][direction_LeftRight] != 0) {
						
					}else {
						blockCheck = false;
					}
				}else if(keyVal.equals("D")) {
					if(Map[direction_UpDown][direction_LeftRight - 1] != 0 ||Map[direction_UpDown][direction_LeftRight + 1] != 0 ) {
						Map[direction_UpDown][direction_LeftRight] = 1;	
						Map[direction_UpDown][direction_LeftRight+1] = 1;	
						Map[direction_UpDown][direction_LeftRight+2] = 1;	
						Map[direction_UpDown][direction_LeftRight+3] = 1;
						direction_LeftRight++;
						Map[direction_UpDown][direction_LeftRight] = 0;
						Map[direction_UpDown][direction_LeftRight+1] = 0;
						Map[direction_UpDown][direction_LeftRight+2] = 0;
						Map[direction_UpDown][direction_LeftRight+3] = 0;
					}
					else if(Map[direction_UpDown+1][direction_LeftRight] != 0) {
						
					}
					else {
						blockCheck = false;
					}
				}
			}
		}else {
			if(!blockCheck) {
				switch(iRandomVal) {
				case 1: 
					Map[direction_UpDown][direction_LeftRight] = tb.block[0][0][0];
					Map[direction_UpDown][direction_LeftRight+1] = tb.block[0][0][1];
					Map[direction_UpDown][direction_LeftRight+2] = tb.block[0][0][2];
					Map[direction_UpDown][direction_LeftRight+3] = tb.block[0][0][3];
				}
				blockCheck = true;
			}
			else {
				if(keyVal.equals("S")) {
					if(Map[direction_UpDown+1][direction_LeftRight] != 0) {
						Map[direction_UpDown][direction_LeftRight] = 1;	
						Map[direction_UpDown][direction_LeftRight+1] = 1;	
						Map[direction_UpDown][direction_LeftRight+2] = 1;	
						Map[direction_UpDown][direction_LeftRight+3] = 1;
						
						Map[direction_UpDown+1][direction_LeftRight] = 0;	
						Map[direction_UpDown+1][direction_LeftRight+1] = 0;	
						Map[direction_UpDown+1][direction_LeftRight+2] = 0;	
						Map[direction_UpDown+1][direction_LeftRight+3] = 0;
						direction_UpDown++;
					}
					else {
						System.out.println("제일 마지막이다!!!!!!!!!!!!!!!");
						direction_UpDown = 1;
						direction_LeftRight = 4;
						blockCheck = false;
					}
				}else if(keyVal.equals("A")) {
					if(Map[direction_UpDown][direction_LeftRight - 1] != 0 ||Map[direction_UpDown][direction_LeftRight + 1] != 0 ) {
						Map[direction_UpDown][direction_LeftRight] = 1;	
						Map[direction_UpDown][direction_LeftRight+1] = 1;	
						Map[direction_UpDown][direction_LeftRight+2] = 1;	
						Map[direction_UpDown][direction_LeftRight+3] = 1;
						direction_LeftRight--;
						
						Map[direction_UpDown][direction_LeftRight] = 0;
						Map[direction_UpDown][direction_LeftRight+1] = 0;
						Map[direction_UpDown][direction_LeftRight+2] = 0;
						Map[direction_UpDown][direction_LeftRight+3] = 0;
					}else if(Map[direction_UpDown+1][direction_LeftRight] != 0) {
						
					}else {
						blockCheck = false;
					}
				}else if(keyVal.equals("D")) {
					if(Map[direction_UpDown][direction_LeftRight - 1] != 0 ||Map[direction_UpDown][direction_LeftRight + 1] != 0 ) {
						Map[direction_UpDown][direction_LeftRight] = 1;	
						Map[direction_UpDown][direction_LeftRight+1] = 1;	
						Map[direction_UpDown][direction_LeftRight+2] = 1;	
						Map[direction_UpDown][direction_LeftRight+3] = 1;
						direction_LeftRight++;
						Map[direction_UpDown][direction_LeftRight] = 0;
						Map[direction_UpDown][direction_LeftRight+1] = 0;
						Map[direction_UpDown][direction_LeftRight+2] = 0;
						Map[direction_UpDown][direction_LeftRight+3] = 0;
					}
					else if(Map[direction_UpDown+1][direction_LeftRight] != 0) {
						
					}
					else {
						blockCheck = false;
					}
				}
			}
		}
		
		
		for(int i = 0; i < Map.length; i++) {
			for(int j = 0; j < Map[i].length; j++) {
				
				
				
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
