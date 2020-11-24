import java.util.Scanner;

public class Exercise09_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle(4, 40);

        System.out.println("The area of a rectangle with width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("The area of a rectangle with width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle2.getPerimeter());

    }
}
class Rectangle {
   /** The perimeter of this rectangle */
   double perimeter;
   double width;
   double height;

    /** Construct a rectangle object */
    Rectangle() {
        width = 1;
        height = 1;
    }

    /** Construct a rectangle object */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /** Return the area of this rectangle */
    double getArea() {
        return width * height;
    }

    /** Return the perimeter of this rectangle */
    double getPerimeter() {
        return width + width + height + height;
    }

    void setPerimeter (double newPerimeter){
        perimeter = newPerimeter;
    }
}

