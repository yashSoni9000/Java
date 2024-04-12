public class InnerClasses {
    public static void main(String[] args){
        OuterClass o= new OuterClass();
        o.outerMethod();
        OuterClass.InnerClass i=new OuterClass().new InnerClass();
        i.innerMethod();
    }
}
class OuterClass{
    int x=10;
    class InnerClass{
        int y=20;
        void innerMethod(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerMethod(){
        InnerClass i=new InnerClass();
        i.innerMethod();
        System.out.println(i.y);
    }
}