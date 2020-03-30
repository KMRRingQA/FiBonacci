package com.qa.main;

public class FiBonacci {
	public void fibonacci(long limit) {
		long int1 = 0;
		long int2 = 1;
		for (long intSum = 0; intSum < limit; intSum = int1 + int2) {
			if (intSum > limit) {
				break;
			}
			System.out.print(intSum + "  ");
			int1 = int2;
			int2 = intSum;
		}
	}
}
