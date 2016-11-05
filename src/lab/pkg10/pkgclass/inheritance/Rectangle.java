/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg10.pkgclass.inheritance;

/**
 *
 * @author 1609963
 */
public class Rectangle extends Shape {

    private final double height;
    private final double base;

    public Rectangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (base + height);
    }

}
