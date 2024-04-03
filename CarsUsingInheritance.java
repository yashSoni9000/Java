import java.util.concurrent.Callable;

public class CarsUsingInheritance {
    public static void main(String[] args){
        LuxuryCar c=new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openSunroof();
    }
}
class Car{
    public void start(){ System.out.println("car started"); }
    public void accelerate(){ System.out.println("car accelerated"); }
    public void changeGear(){ System.out.println("car gears changed"); }
}
class LuxuryCar extends Car{
//    @Override public void start(){System.out.println("luxury car started");} // even if we do not define this it will call parent class methods
//    @Override public void accelerate() { System.out.println("luxury car accelerated");}
    @Override
    public void changeGear() { System.out.println("luxury car gears changed automatically");}
    public void openSunroof(){System.out.println("Sunroof opened");}
}