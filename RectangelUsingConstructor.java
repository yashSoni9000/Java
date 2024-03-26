public class RectangelUsingConstructor {
    public static void main(String[] args){
        RectangleConstructor r1= new RectangleConstructor();
        RectangleConstructor r2= new RectangleConstructor(2,3);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}

class RectangleConstructor{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int length) {
        if(length>0) this.length = length;
        else length=0;
    }
    public void setBreadth(int breadth) {
        if(breadth>0) this.breadth = breadth;
        else breadth=0;
    }

    public RectangleConstructor(){
        setLength(4);
        setBreadth(5);
    }
    public RectangleConstructor(int l,int b){
        setLength(l);
        setBreadth(b);
    }
    public int area(){
        return getLength()*getBreadth();
    }
}