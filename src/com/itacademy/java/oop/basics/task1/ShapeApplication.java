package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {
        Shape circle = new Circle(3.4);
        Shape square = new Square(6.66);
        Shape[] shapes = {circle, square};
        System.out.println(toString(shapes));
    }

    public static String toString(Shape[] shapes) {
        String info = "";

        for (Shape s : shapes) {
            info += String.format("Shape is %s. Area is %s and perimeter is %s\n", s.toString(), s.calculateArea(), s.calculatePerimeter());
        }
        return info;
    }
}
