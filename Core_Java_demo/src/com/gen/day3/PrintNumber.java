package com.gen.day3;

public class PrintNumber {
	public void printn(int number) {
		System.out.println("Integer Number: " + number);
	}
	public void printn(float number) {
		System.out.println("Float Number: " + number);
	}
	public void printn(double number) {
		System.out.println("Double Number: " + number);
	}
	public void printn(long number) {
		System.out.println("Long Number: " + number);
	}
	public void printn(short number) {
		System.out.println("Short Number: " + number);
	}
	public void printn(byte number) {
		System.out.println("Byte Number: " + number);
	}
	public void printn(char number) {
		System.out.println("Character Number: " + number);
	}

	public static void main(String[] args) {
		PrintNumber printNumber = new PrintNumber();
		printNumber.printn(10);
		printNumber.printn(3.14f);
		printNumber.printn(3.14159265359);
		printNumber.printn(100000000000L);
		printNumber.printn((short)100);
		printNumber.printn((byte)5);
		printNumber.printn('A');
		
		

	}

}
