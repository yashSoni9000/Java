public class CylinderUsingInheritance {
    public static void main(String[] args){
        Circle ci=new Circle();
        System.out.println("Circle Base");
        ci.setRadius(2);
        System.out.println(ci.area());
        System.out.println(ci.perimeter());
        System.out.println(ci.getRadius());
        System.out.println("Cylinder Inherit-->");
        CylinderInherit cy=new CylinderInherit(8);
        cy.setRadius(3);
        cy.setHeight(6);
        System.out.println(cy.area());
        System.out.println(cy.volume());
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
    }
}

class Circle{
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;
    public Circle(){
        this.radius=4;
    }
    public double area(){
        return (Math.PI*radius*radius);
    }
    public double perimeter(){
        return (2*Math.PI*radius);
    }
}
class CylinderInherit extends Circle{
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;
    public CylinderInherit(double height){
//        super();
        this.height=height;
    }
    public double volume(){
        return (Math.PI*getRadius()*getRadius()*height);
    }
    public double area(){
        return 2 * Math.PI * getRadius() * height;
    }
}