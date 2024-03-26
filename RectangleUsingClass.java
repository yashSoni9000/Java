public class RectangleUsingClass {
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.length=5.2;
        r1.breadth=4.8;

        System.out.println(r1.area());
        System.out.println(r1.perimeter());


        r2.length=5;
        r2.breadth=5;
        System.out.println(r2.isSquare());
    }
}
class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}

