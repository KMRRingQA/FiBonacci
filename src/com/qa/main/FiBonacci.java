package com.qa.main;

public class FiBonacci {

	public int[] add(int[] int1, int[] int2) {
		int CarryOver = 0;
		int[] int3 = new int[int1.length];
		for (int i = int2.length - 1; i >= 0; i--) {
			if (int1[i] + int2[i] + CarryOver > 9) {
				int3[i] = int1[i] + int2[i] + CarryOver - 10;
				CarryOver = 1;
			} else {
				int3[i] = int1[i] + int2[i] + CarryOver;
				CarryOver = 0;
			}
		}
		if (CarryOver == 1) {
			int3[0] = 1;
		}
		return int3;
	}

	public void fibonacci(String limit) {
		int length = limit.length() + 1;
		int[] int1 = new int[length];
		int[] int2 = new int[length];
		System.out.print("1");
		int2[length - 1] = 1;
		while (true) {
			int[] int3 = this.add(int1, int2);
			if (!this.smallerEqualLimit(int3, limit)) {
				break;
			}
			this.printIntArray(int3);
			int1 = int2;
			int2 = int3;
		}
	}

	public void printIntArray(int[] int3) {
		System.out.print("\n");
		boolean numberStarted = false;
		for (int i = 0; i < int3.length; i++) {
			if (numberStarted == false && int3[i] == 0) {
				continue;
			}
			numberStarted = true;
			System.out.print(int3[i]);
		}
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
