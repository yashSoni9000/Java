public class TestingStringClass {
    public static void main(String[] args){
//        String str1="Hello world";
//        String str2="Hello world";
//        str2=str2+" Hi!!";
//        System.out.println(str2);

        // another method to declare string
        String str1=new String("Hello world");
        String str2=new String("Hello world");
        str2+=" Hi!!";
        System.out.println(str2);

        // declaring string using char array
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);// output = Hello

        //declaring using byte
        byte d[]={65,66,67,68};
        String str4=new String(d);
        System.out.println(str4);//output = ABCD
        // we can also get substring of all above string by passing 2 more arguments in string constructor
        String s5=new String(d,1,2);
        System.out.println(s5);// output = BC


        // checking reference from pool and heap in declaring String in java
        String s6="Java";
        String s7="Java";
        System.out.println(s6==s7); //output = true
        // but if we define with string constructor then
        String s8 = new String("Java");
        System.out.println(s6==s8); //output = false

    }
}
