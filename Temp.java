public class Temp {
    public static void main(String[] args){
        Emp e1= new Emp();
        Emp e2= new Emp(1);
        Emp e3= new Emp("yash");
        e1.show();
        e2.show();
        e3.show();
    }
}

class Emp{
    static int id;
    static String s;
    public Emp(){
        System.out.println("bruh!!");
    }
    public Emp(int id){
        Emp.id =id;
    }
    public Emp(String s){
        Emp.s =s;
    }
    static void show(){
        System.out.println("ID is: "+id+" & name is: "+s);
    }
}