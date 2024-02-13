import javax.swing.JOptionPane;
import java.math.RoundingMode;
import java.text.DecimalFormat;
class Circle extends Shapes {
    private double radius;
    private boolean invalid = true;
    DecimalFormat df = new DecimalFormat("0.0");

    public void calculateProperties()
    {
        while(invalid == true)
        {
            try
            {
                radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle"));
                if(radius<=0)
                {
                    JOptionPane.showMessageDialog(null, "Invalid input. Radius cannot be negative");
                    invalid = true;
                    throw new Exception();
                }
                invalid = false;
                break;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid input.  Radius value must be a number");
                invalid = true;
            }
        }


        double circumference= circumference(radius);
        double volume= volume(radius);
        double surfaceArea= surfaceArea(radius);
        printSquareCalculations(surfaceArea, volume, circumference);
    }
    public double circumference(double radius)
    {
        double circumference=2*Math.PI*radius;
        return circumference;
    }
    public double volume(double radius)
    {
        double volume=Math.PI*radius*radius*radius;
        return volume;
    }
    public double surfaceArea(double radius)
    {
        double surfaceArea=Math.PI*radius*radius;
        return surfaceArea;
    }
    public void printSquareCalculations(double surfaceArea, double volume, double circumference)
    {
        JOptionPane.showMessageDialog(null, "The surface area of the circle is " + df.format(surfaceArea) + " untis" +
                "\nThe circumference of the circle is " + df.format(circumference) + " untis" + "\nThe volume of the sphere is " + df.format(volume) + " untis" );
        invalid = true;
    }
}
