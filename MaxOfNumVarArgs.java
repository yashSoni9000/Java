public class MaxOfNumVarArgs {
    public static void main(String[] args){
        System.out.println(maxNum());
        System.out.println(maxNum(1,2,3,4,5,6));
        System.out.println(maxNum(1,2,3,4,5,6,7));
    }
    static int maxNum(int ...a){
        int maxi=Integer.MIN_VALUE;
        if(a.length==0) return Integer.MIN_VALUE;
        for(int x:a){
            if(x>maxi) maxi=x;
        }
        return maxi;
    }
}
