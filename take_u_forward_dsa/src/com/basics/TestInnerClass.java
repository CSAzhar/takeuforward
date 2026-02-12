package com.basics;

@FunctionalInterface
interface Calculation{
	public int calculation();
}
public class TestInnerClass {
	public static void main(String[] args) {
		Calculation myCalculate = () -> 5;
		System.out.println(myCalculate.calculation());
	}
}
