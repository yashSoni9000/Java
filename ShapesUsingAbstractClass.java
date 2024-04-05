public class ShapesUsingAbstractClass {
    public static void main(String[] args){
        CircleAbstract ca=new CircleAbstract();
        ca.setRadius(5);
        System.out.println(ca.area());
        System.out.println(ca.perimeter());
        System.out.println();
        RectangleAbstract ra=new RectangleAbstract();
        ra.setLength(4);
        ra.setBreadth(5);
        System.out.println(ra.area());
        System.out.println(ra.perimeter());
        System.out.println();
        Shape s=ca;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
abstract class Shape{
    abstract double perimeter();
    abstract double area();
}
class CircleAbstract extends Shape{
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;
    public CircleAbstract(){
        this.radius=1;
    }

    @Override public double perimeter(){
        return 2*(Math.PI*getRadius());
    }
    @Override public double area(){
        return Math.PI*getRadius()*getRadius();
    }
}
class RectangleAbstract extends Shape{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    private double breadth;
    public RectangleAbstract(){
        this.length=1;
        this.breadth=1;
    }

    @Override public double perimeter(){
        return 2*(getLength()+getBreadth());
    }
    @Override public double area(){
        return getLength()*getBreadth();
    }
}