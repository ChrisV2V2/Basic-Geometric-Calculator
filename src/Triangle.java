import javax.swing.JOptionPane;
//package com.mkyong.math.rounding;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Triangle extends Shapes
{

    private double base;
    private double height;
    private double length;

   private boolean invalid = true;
   DecimalFormat df = new DecimalFormat("0.0");


    public void calculateProperties()
    {
        while (invalid == true)
        {
            try {
                base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle"));
                if (base < 0) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Base cannot be negative.");
                    invalid = true;
                    throw new Exception();
                }
                invalid = false;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Base value must be a number.");
                invalid = true;
                continue;
            }

            try {
                height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the triangle"));
                if (height < 0) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Height cannot be negative");
                    invalid = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Height value must be numeric.");
                invalid = true;
                continue;
            }

            try {
                length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the triangle"));
                if (length < 0) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Length cannot be negative");
                    invalid = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Length value must be numeric.");
                invalid = true;
                continue;
            }

            double circumference = circumference(base, height);
            double volume = volume(base, height, length);
            double surfaceArea = surfaceArea(base, height);
            printSquareCalculations(surfaceArea, volume, circumference);
            break;
        }
    }

        public double surfaceArea (double base, double height)
        {
            double surfaceArea = (base * height) / 2;
            return surfaceArea;
        }

        public double circumference ( double base, double height)
        {
            double circumference = (base + height + Math.sqrt(base * base + height * height));
            return circumference;
        }

        public double volume(double base, double height, double length)
        {
            double volume = (1.0 / 3.0) * base * height * length;
            return volume;
        }


        public void printSquareCalculations(double surfaceArea, double volume, double circumference)
        {
            JOptionPane.showMessageDialog(null, "Triangle:\nSurface Area: " + df.format(surfaceArea) + " units" +"\nVolume: " + df.format(volume) + " units" + "\nCircumference: " + df.format(circumference) + " units");
            invalid  = true;
        }


}