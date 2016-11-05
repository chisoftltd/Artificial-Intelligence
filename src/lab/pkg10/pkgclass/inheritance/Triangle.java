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
public class Triangle extends Shape {

    private final double base;
    private final double height;
    private final double sideA = 4.2;
    private final double sideC = 9.0;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double getArea() {
        return (base / 2) * height;
    }

    @Override
    public double getPerimeter() {
        return base + sideA + sideC;
    }

}
