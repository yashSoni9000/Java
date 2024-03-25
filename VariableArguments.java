public class VariableArguments {
    public static void main(String[] args){ //WE CAN USE "..." HERE AS WELL!!
        show();// dont work when atleast one argument is needed
        System.out.println();
        show(10,20);
        System.out.println();
        show(10,20,30);
        System.out.println();
        show(10,20,30,40);
        System.out.println();
        show(new int []{10,20,30,40,50});
        System.out.println();
        showList(4,"mumma","I","will","work","even","harder");
    }
    static void show(int ...a){
        for(int x:a) System.out.print(x+" ");
    }
    // if we need atleast one argument using ellipse
//    static void show(int b,int ...a){
//        for(int x:a) System.out.print(x+" ");
//    }
    static void showList(int x,String ...s){
        System.out.println(x+" hehe boi!!");
        for (String string : s) System.out.print(string + " ");
    }
}
