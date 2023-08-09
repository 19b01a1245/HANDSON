package com.gen.day3;

class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}


class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}


class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }

    public static void main(String[] args) {
        Degree degreeObj = new Degree();
        Undergraduate undergraduateObj = new Undergraduate();
        Postgraduate postgraduateObj = new Postgraduate();

        degreeObj.getDegree();
        undergraduateObj.getDegree();
        postgraduateObj.getDegree();
    }
}
