package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		FiBonacci fiBonacci = new FiBonacci();
		fiBonacci.fiBonacci("10");

		System.out.println();
		SimpleFiBonacci simpleFiBonacci = new SimpleFiBonacci();
		simpleFiBonacci.fiBonacci(10);
	}
}
