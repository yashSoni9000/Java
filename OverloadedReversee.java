public class OverloadedReversee {
    public static void main(String[] args){
        System.out.println(reverse(12345));
        int[] a={1,2,3,4,5};
        int[] ans=reverse(a);
        for(int x:ans) System.out.print(x+" ");
    }
    static int reverse(int num){
        int ans=0;
        while(num>0){
            int last=num%10;
            ans*=10;
            ans+=last;
            num/=10;
        }
        return ans;
    }
    static int[] reverse(int a[]){
        int[] b=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--,j++){
            b[j]=a[i];
        }
//        for(int i=0;i<a.length;i++){
//            a[i]=b[i];
//        }
        return b;
    }
}
