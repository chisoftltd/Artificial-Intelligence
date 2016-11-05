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
public class Lab10ClassInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(3.0, 4.9);
        shapes[2] = new Triangle(4.6, 2.9);

        JOptionPane.showMessageDialog(null, "Area : " + shapes[0].getArea() + " and Perimeter : " + shapes[0].getPerimeter());
        JOptionPane.showMessageDialog(null, "Area : " + shapes[1].getArea() + " and Perimeter : " + shapes[1].getPerimeter());
        JOptionPane.showMessageDialog(null, "Area : " + shapes[2].getArea() + " and Perimeter : " + shapes[2].getPerimeter());
    }

}
