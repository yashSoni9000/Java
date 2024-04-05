public class AbstractClasses {
    public static void main(String[] args){
        Super supr=new GrandSub();
        supr.meth1();
        supr.meth2();
        System.out.println();

        Sub sb=new GrandSub();
        sb.meth1();
        sb.meth2();
        sb.meth3();
        System.out.println();

        GrandSub gs=new GrandSub();
        gs.meth1();
        gs.meth2();
        gs.meth3();

    }
}
abstract class Super{
    public Super(){
        System.out.println("super constructor");
    }
    public void meth1(){System.out.println("super meth 1");}
    abstract public void meth2();
}
abstract class Sub extends Super{
//    @Override public void meth2(){System.out.println("sub meth 2");}
    public void meth3(){
        System.out.println("sub meth3");
    }
}
class GrandSub extends Sub{
    @Override
    public void meth2() {
        System.out.println("GrandSub meth 2");
    }
}