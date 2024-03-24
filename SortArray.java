public class SortArray {
    public static void main(String[] args){
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(arr);
        for(String s:arr){
            System.out.print(s+" ");
        }
    }
}
