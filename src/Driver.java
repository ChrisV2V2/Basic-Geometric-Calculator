import javax.swing.JOptionPane;

public class Driver {
    public static void main(String[] args) {
        int shapeChoice = 0;

        JOptionPane.showMessageDialog(null, "Welcome to the Geometric Calculator project! ");
        Square  square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();


        while (shapeChoice != 4) {
            try {
                shapeChoice = Integer.parseInt(JOptionPane.showInputDialog("Select a shape to calculate circumference, surface area, and volume:"
                        + "\n1. Square\n2. Triangle\n3. Circle\n4. Quit"));
                switch (shapeChoice) {
                    case 1:
                        square.calculateProperties();
                        break;
                    case 2:
                        triangle.calculateProperties();
                        break;
                    case 3:
                        circle.calculateProperties();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Exiting the program.");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please select a valid option (1-4).");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid option. Please enter a valid number.");
            }
        }
    }
}
