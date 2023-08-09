package com.gen.day4;

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }


    public static void main(String[] args) {
        
        Shape shapeObj = new Shape();
        Rectangle rectangleObj = new Rectangle();
        Circle circleObj = new Circle();
        Square squareObj = new Square();

       
        shapeObj.printShape();  
        rectangleObj.printRectangle();
        circleObj.printCircle();    
        squareObj.printSquare();    

        
        squareObj.printShape();     
        squareObj.printRectangle(); 
    }
}


