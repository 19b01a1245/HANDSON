package com.gen.day5;

public interface Shape {
	boolean fitsText(String text);
}
public class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Implementing the fitsText method for Circle
    @Override
    public boolean fitsText(String text) {
        return text.length() <= 2 * radius; // Assuming we're comparing the text length with the diameter of the circle
    }
}
public class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    // Implementing the fitsText method for Rectangle
    @Override
    public boolean fitsText(String text) {
        return text.length() <= length && text.length() <= width;
    }
}

public class Sign {
    private Shape background;
    private String text;

    public Sign(Shape background, String text) {
        this.background = background;
        this.text = text;
    }
}

public class Circle { 
}

public class Rectangle implements Shape {
    // ... Rectangle class code

    // Typo in method name 'fitsText'
    public boolean fitText(String text) {
        return text.length() <= length && text.length() <= width;
    }
}




