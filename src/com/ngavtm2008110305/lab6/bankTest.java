/*
* created date: Nov 01, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab6;

public class bankTest {
    
    public static void main(String[] args) {

        Circle circle = new Circle();

        Square square = new Square();

        Triangle triangle = new Triangle();


        circle.xoay();
        circle.playSound();

        triangle.xoay();
        triangle.playSound();

        square.xoay();
        square.playSound();

    }
}
