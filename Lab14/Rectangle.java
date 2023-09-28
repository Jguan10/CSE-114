// This program is the object for rectangle
public class Rectangle {
    double width = 1;
    double height = 1;

    // Constructor without arguments
    public Rectangle(){
    }

    // Constructor with arguments
    public Rectangle(double newWidth,double newLength){
        width = newWidth;
        height = newLength;
    }

    // Method to calculate area
    public double getArea(){
        return height * width;
    }

    // Method to calculate perimeter
    public double getPerimeter(){
        return height + height + width + width;
    }
}
