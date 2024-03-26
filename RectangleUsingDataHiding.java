public class RectangleUsingDataHiding {
    public static void main(String[] args){
        RectangleHiding r1=new RectangleHiding();
//        RectangleHiding r2=new RectangleHiding();


        r1.setBreadth(5.2);
        r1.setLength(4.8);


        System.out.println(r1.area());
        System.out.println(r1.perimeter());


        System.out.println(r1.isSquare());
    }
}
class RectangleHiding{
    private double length;
    private double breadth;

    public double getBreadth() {
        return breadth;
    }
    public double getLength() {
        return length;
    }
    public void setBreadth(double breadth) {
        if(breadth>0) this.breadth = breadth;
        else this.breadth=0;
    }
    public void setLength(double length) {
        if(length>0) this.length = length;
        else this.length=0;
    }

    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}

