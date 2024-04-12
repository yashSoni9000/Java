public class SingletonClass {
    public static void main(String[] args){
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        CoffeeMachine m4=CoffeeMachine.getInstance();
        CoffeeMachine m5=CoffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3+" "+m4+" "+m5);
        if(m1==m2 && m1==m3){
            System.out.println("they are the same bruh");
        }
    }
}
class CoffeeMachine{
    private int coffeeQuantity;
    private int milkQuantity;
    private int waterQuantity;
    static public CoffeeMachine ok=null;
    static int count=0;
    private CoffeeMachine(){
        coffeeQuantity=1;
        milkQuantity=1;
        waterQuantity=1;
    }
    static CoffeeMachine getInstance(){
        if(count<=3){
            ok=new CoffeeMachine();
            count++;
        }
        return ok;
    }
}