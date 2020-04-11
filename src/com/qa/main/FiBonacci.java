package com.qa.main;

public class FiBonacci {

	public void fiBonacci(String limit) {
		StringArithmetics stringArithmetics = new StringArithmetics();
		int length = limit.length() + 1;

		int[] int1 = new int[length];
		int[] int2 = new int[length];
		int2[length - 1] = 1;
		int[] int3 = stringArithmetics.addIntArrays(int1, int2);
		while (stringArithmetics.smallerEqualLimit(int3, limit)) {
			stringArithmetics.printIntArray(int3);
			int3 = stringArithmetics.addIntArrays(int1, int2);
			int1 = int2;
			int2 = int3;
		}
	}
}
