package com.qa.main;

public class SimpleFiBonacci {

	public void fiBonacci(int limit) {

		int int1 = 0;
		int int2;
		int2 = 1;
		int int3 = int1 + int2;
		while (int3 <= limit) {
			System.out.println(int3);
			int3 = int1 + int2;
			int1 = int2;
			int2 = int3;
		}
	}

}
