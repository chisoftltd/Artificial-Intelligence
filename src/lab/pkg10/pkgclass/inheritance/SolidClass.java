/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg10.pkgclass.inheritance;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class SolidClass {

    public static void main(String[] args) {
        Solid[] solids = new Solid[4];
        solids[0] = new Sphere(4.9);
        solids[1] = new Cone(2.9, 7.9);
        solids[2] = new Cylinder(5.9, 6.9);
        solids[3] = new Box(4.7, 8.0, 2.9);

        JOptionPane.showMessageDialog(null, "Volume : " + solids[0].getVolume() + " and \nSurface Area : " + solids[0].getSurfaceArea());
        JOptionPane.showMessageDialog(null, "Volume : " + solids[1].getVolume() + " and \nSurface Area : " + solids[1].getSurfaceArea());
        JOptionPane.showMessageDialog(null, "Volume : " + solids[2].getVolume() + " and \nSurface Area : " + solids[2].getSurfaceArea());
        JOptionPane.showMessageDialog(null, "Volume : " + solids[3].getVolume() + " and \nSurface Area : " + solids[3].getSurfaceArea());

    }
}
