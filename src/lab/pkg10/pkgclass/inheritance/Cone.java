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
public class Cone extends Solid {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1 / 3) * Math.PI * height * (radius * radius);
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt((radius * radius + height * height)));
    }

    @Override
    public String toString() {
        return "Volume : " + getVolume() + " Area : " + getSurfaceArea();
    }

}
