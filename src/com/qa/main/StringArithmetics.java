package com.qa.main;

public class StringArithmetics {

	public int[] addIntArrays(int[] int1, int[] int2) {
		int carryOver = 0;
		int[] int3 = new int[int1.length];
		for (int i = int2.length - 1; i >= 0; i--) {
			if (int1[i] + int2[i] + carryOver > 9) {
				int3[i] = int1[i] + int2[i] + carryOver - 10;
				carryOver = 1;
			} else {
				int3[i] = int1[i] + int2[i] + carryOver;
				carryOver = 0;
			}
		}
		if (carryOver == 1) {
			int3[0] = 1;
		}
		return int3;
	}

	public void printIntArray(int[] int3) {
		boolean numberStarted = false;
		for (int i = 0; i < int3.length; i++) {
			if (numberStarted == false && int3[i] == 0) {
				continue;
			}
			numberStarted = true;
			System.out.print(int3[i]);
		}
		System.out.print("\n");
	}

	public boolean smallerEqualLimit(int[] tempSum, String limit) {
		int[] limitString = this.stringToIntArray(limit);
		for (int i = 0; i < tempSum.length; i++) {
			if (tempSum[i] > limitString[i]) {
				return false;
			} else if (tempSum[i] < limitString[i]) {
				return true;
			}
		}
		return true;
	}

	public int[] stringToIntArray(String limit) {
		int[] limitString = new int[limit.length() + 1];
		for (int i = 1; i <= limit.length(); i++) {
			limitString[i] = Integer.parseInt(limit.substring(i - 1, i));
		}
		return limitString;
	}
}
