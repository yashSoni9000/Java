public class Interface {
    public static void main(String[] args){
        Superr s=new Subb();
        s.meth1();
        s.meth2();
//        s.meth3();// not applicable
    }
}

interface Superr{
    void meth1();
    void meth2();
}
class Subb implements Superr{

    @Override
    public void meth1() {
        System.out.println("meth 1 subb");
    }
    @Override
    public void meth2() {
        System.out.println("meth 2 subb");
    }
    public void meth3(){
        System.out.println("meth 3 subb");
    }
}