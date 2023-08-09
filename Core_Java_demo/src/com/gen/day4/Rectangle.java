package com.gen.day4;

class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    double calculateArea() {
        return length * breadth;
    }

    
    double calculatePerimeter() {
        return 2 * (length + breadth);

}

class Square extends Rectangle {
    
    Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(5, 8);
        Square square = new Square(4);

        
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);
	}
}

}
