public class ConstructorUsingInheritance {
    public static void main(String[] args){
//        Parent p=new Parent();
//        Child c=new Child();
        GrandChild gc=new GrandChild();//  all 3 sout are printed from parent to grand child in same manner
        // constructor executes from top to bottom
    }
}

class Parent{
    public Parent() {
        System.out.println("In parent class");
    }
}

class Child extends Parent{
    public Child() {
        System.out.println("In child class");
    }
}

class GrandChild extends Child{
    public GrandChild() {
        System.out.println("In grand child class");
    }
}