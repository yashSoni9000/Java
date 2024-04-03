public class CuboidUsingInheritance {
    public static void main(String[] args){
        Rectagle s1=new Cuboid();
        Cuboid s2=new Cuboid(5);
        Cuboid s3=new Cuboid(1 ,2 ,3);

        System.out.println("huh bro??!!"+s1.x);
        System.out.println(s1.area());// ans=1
        System.out.println(s2.area());// ans=5
        System.out.println(s3.area());// ans=6

    }
}
class Rectagle{
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    private int length;
    private int breadth;
    int x=10;
    public Rectagle(){
        length=breadth=1;
    }
    public Rectagle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rectagle{
    private int height;
    int x=20;
    public Cuboid() {
        this.height=1;
    }
    public Cuboid(int h){
        this.height=h;
    }
    public Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    @Override public int area(){
        System.out.println("my class x"+x);
        System.out.println("my super x"+super.x);
//        System.out.println("my rectangle area "+super.area());
        return getLength()*getBreadth()*height;
    }
}