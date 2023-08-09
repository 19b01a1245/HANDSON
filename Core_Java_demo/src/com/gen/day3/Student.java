package com.gen.day3;

public class Student {
	private String name;
	private int age;
	private String address;
	
	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}
	public void setInfo(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setInfo(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	

	public static void main(String[] args) {
		Student[] students = new Student[10];
		for(int i = 0; i<10; i++) {
			students[i] = new Student();
			students[i].setInfo("Student" + (i + 1), i + 15, "Address " + (i + 1));
			
		}
		for (Student stud : students) {
			System.out.println("Name: " + stud.getName() + " | Age: " + stud.getAge() + " | Address: " + stud.getAddress());
		}
	
		

	}

}
