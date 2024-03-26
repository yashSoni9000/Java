public class CylinderUsingConstructor {
    public static void main(String[] args){
        CylinderConstructor c1=new CylinderConstructor();
        CylinderConstructor c2=new CylinderConstructor(2,5);

        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}
class CylinderConstructor{
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double radius) {
        if(radius>0) this.radius = radius;
        else radius=0;
    }
    public void setHeight(double height) {
        if(height>0) this.height = height;
        else height=0;
    }

    public CylinderConstructor(){
        setRadius(4);
        setHeight(5);
    }
    public CylinderConstructor(double r,double h){
        setRadius(r);
        setHeight(h);
    }
    public double area(){
        double radius=getRadius();
        return Math.PI*radius*radius*getHeight();
    }
}