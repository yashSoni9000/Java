public class StaticInnerClass {
    public static void main(String[] args){
        StaticOuter.Moye m=new StaticOuter.Moye();
        m.show();
    }
}
class StaticOuter{
    int x=10;
    static int y=20;
    static class Moye{
        public void show(){
            System.out.println(y);
//            System.out.println(x);// we can only access static members of outer class
        }
    }
}