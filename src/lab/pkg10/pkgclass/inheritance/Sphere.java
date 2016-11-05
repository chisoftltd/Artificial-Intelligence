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
public class Sphere extends Solid {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return ((4 / 3) * Math.PI * (radius * radius));
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Volume : " + getVolume() + " Area : " + getSurfaceArea();
    }

}
