package com.java.Question;

public class Main {

	public static void main(String[] args) {
		// 두개 먹고 도착점가는거
		Question1 q1 = new Question1();
		//q1.Question1_Loop();
		
		// 움직이는거 까지만 완성. (그냥 맵 이동만...)
		Question2 q2 = new Question2();
		//q2.Question2_Loop();
		
		// 피하기
		Question3 q3 = new Question3();
		q3.Question3_Loop();
		
		// 하트
		Question4 q4 = new Question4();
		//q4.Question4_Routine(1, 1, 1, 1);
		//q4.Question4_Loop();

		Question5 q5 = new Question5();
		//q5.Question5_Routine();
		//q5.Question5_Loop();
		
		Question6 q6 = new Question6();
		//q6.Question5_Loop();

		// 십자가 안에 블럭 넣기
		Question7 q7 = new Question7();
		//q7.Question7_Loop();
		
		// 블럭맞추기
		Question8 q8 = new Question8();
		//q8.Question8_Loop();
		
	
		ArrayClass a = new ArrayClass();
		//a.Array_Print();
	}
}
