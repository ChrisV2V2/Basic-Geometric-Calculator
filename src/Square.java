import javax.swing.JOptionPane;


class Square extends Shapes
{
    boolean invalid = true;
    double side;

    public void calculateProperties()
    {
        while(invalid == true)
        {
            try
            {
                side = Double.parseDouble(JOptionPane.showInputDialog("Enter the lenght of the side of the square"));
                if(side<0)
                {
                    JOptionPane.showMessageDialog(null, "Invalid input. Side cannot be negative");
                    invalid = true;
                    throw new Exception();
                }
                invalid = false;
                break;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid input.  Side value must be a number");
                invalid = true;
            }
        }


        double circumference=circumference(side);
        double volume=volume(side);
        double surfaceArea=surfaceArea(side);
        printSquareCalculations(surfaceArea, volume, circumference);
    }

    public double circumference(double side)
    {
        double circumference=4*side;
        return circumference;
    }


    public double volume(double side)
    {
        double volume=side*side*side;
        return volume;
    }


    public double surfaceArea(double side)
    {
        double surfaceArea=2*side;
        return surfaceArea;
    }


    public void printSquareCalculations(double surfaceArea, double volume, double circumference)
    {
        JOptionPane.showMessageDialog(null, "The surface area of the square is " + surfaceArea + " untis" +
                "\nThe circumference of the square is " + circumference + " untis" + "\nThe volume of the cube is " + volume + " untis" );
        invalid = true;
    }


}