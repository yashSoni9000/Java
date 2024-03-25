public class OverloadedArea {
    public static void main(String[] args){
        System.out.println(area(2,3));
        System.out.println(area(2));
    }
    static int area(int l,int b){
        return l*b;
    }
    static  double area(double r){
        return (Math.PI*r*r);
    }
}
