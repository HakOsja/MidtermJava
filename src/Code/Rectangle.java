package Code;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getParemetier(){
        return 2*(width+length);

    }
    public static class Square extends Rectangle
    {
    public Square(double side)
        {
           super(side,side);
        }
    }

    public static void main(String[] args) {
    Rectangle rectangle= new Rectangle(8,10);
        System.out.println("Rectangle's Area: "+rectangle.getArea());
        System.out.println("Rectangle's Parimeter: "+rectangle.getParemetier());

     Square square=  new Square(2);
        System.out.println("Square's Area: "+square.getArea());

    }
}
