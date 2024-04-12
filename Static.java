public class Static {
        public static void main(String[] args){
            Emps e1= new Emps();
            Emps e2= new Emps(1);
            Emps e3= new Emps("yash");
            e1.show();
            e2.show();
            e3.show();
            Emp.show();
        }
    }

    class Emps{
        static int id;
        static String s;
        public Emps(){
            System.out.println("bruh!!");
        }
        public Emps(int id){
            Emps.id =id;
        }
        public Emps(String s){
            Emps.s =s;
        }
        static void show(){
            System.out.println("ID is: "+id+" & name is: "+s);
        }

}
