public class CylinderUsingClass {
    public static void main(String[] args){
        Cylinder c1=new Cylinder();
        c1.radius=5;
        c1.height=10;
        System.out.format("%.2f \n",c1.area());
        System.out.format("%.2f \n",c1.totalSurfaceArea());
        System.out.format("%.2f \n",c1.circumference());
        System.out.format("%.2f \n",c1.volume());
    }
}
class Cylinder{
    public double radius;
    public double height;

    public double area(){
        return 2*Math.PI*radius*height;
    }
    public double totalSurfaceArea(){
        return (2*Math.PI*radius)*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double circumference(){
        return totalSurfaceArea();
    }
}
