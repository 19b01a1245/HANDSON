package com.gen.day4;

public class Parent {
	public void printParent() {
		System.out.println("This is parent class.");
	}
}
class Child extends Parent {
	public void printChild() {
		System.out.println("This is child class.");
	}
public static void main(String[] args) {
		Parent parentObj = new Parent();
		Child childObj = new Child();
		
		parentObj.printParent();
		childObj.printChild();
		
		childObj.printParent();
		

	}

}
