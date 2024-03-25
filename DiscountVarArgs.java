public class DiscountVarArgs {
    public static void main(String[] args){
        System.out.println(discount());
        System.out.println(discount(10,20,30));
        System.out.println(discount(10,20,30,40));
        System.out.println(discount(10,20,30,40,50));
    }
    static double discount(double ...a){
        double discount=0;
        double sum= SumOfAllElementsVarArgs.maxSum(a);
        if(sum<60) return sum;
        else if(sum>=60 && sum<100) return sum-sum*0.1;
        else if(sum>=100 && sum<150) return sum-sum*0.15;
        else return sum-sum*0.2;
    }
}
