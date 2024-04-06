public class InterfaceFacts {
    public static void main(String[] args){
        System.out.println(Test.X);
        Test.meth5();
    }
}
interface Test{
    int X=10;
    public abstract void meth1();
    public abstract void meth2();
    private void meth3(){
        System.out.println("in meth 3 boiii ");
    }
    default void meht4(){
        meth3();
    }
    public static void meth5(){
        System.out.println("in meth 5");
    }
}
interface ChildTest extends Test{
    void meth5();
}
class My implements ChildTest{
    @Override
    public void meth1() {

    }
    @Override
    public void meth2() {

    }
    @Override
    public void meth5() {

    }
}