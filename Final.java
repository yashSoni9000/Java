public class Final {
    public static void main(String[] args){
        Finals f=new SubFinal();
        f.finalMethod();
        System.out.println(f.MAX);
        System.out.println(f.MIN);
        System.out.println(f.NORMAL);
    }
}
class Finals{
    final int MIN=1;
    final int NORMAL;
    final int MAX;

    {
        NORMAL=5;
    }
    public Finals(){
        MAX=10;
    }
    final void finalMethod(){
        System.out.println("Final method can not be overrided");
//        MAX=11; // see final members can not be reassigned
    }
}
final class SubFinal extends Finals{
//     @Override void finalMethod(){System.out.println("see it can not be overrided");}
    void subMethod(){
        System.out.println("in sub class");
    }
}

//class grandFinal extends SubFinal{} // see we can not extend it