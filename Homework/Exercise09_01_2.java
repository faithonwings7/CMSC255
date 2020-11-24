public class Exercise09_01_2{

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4,40);
        System.out.println("The width is " + r1.width);
        System.out.println("The height is " + r1.height);
        System.out.println("The area is " + r1.getArea());
        System.out.println("The perimeter is " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("The width is " + r2.width);
        System.out.println("The height is " + r2.height);
        System.out.println("The area is " + r2.getArea());
        System.out.println("The perimeter is " + r2.getPerimeter());
    }
}

class Rectangle{
    double width = 1;
    double height = 1;

    Rectangle(){

    }

    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return width + width + height + height;
    }


