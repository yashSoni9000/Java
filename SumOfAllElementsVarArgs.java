public class SumOfAllElementsVarArgs {
    public static void main(String[] args){
        System.out.println(maxSum());
        System.out.println(maxSum(1,2,3,4,5,6,9));
        System.out.println(maxSum(1,4,5,6,9));
    }
    static int maxSum(int ...a){
        if(a.length==0) return 0;
        int sum=0;
        for (int x:a) sum+=x;
        return sum;
    }
    static double maxSum(double ...a){
        if(a.length==0) return 0;
        double sum=0;
        for (double x:a) sum+=x;
        return sum;
    }
}
