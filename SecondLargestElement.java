public class SecondLargestElement {
    public static void main(String[] args){
        int a[]={11,13,12};
        int largest=0,secondLargest=0;
        for(int x:a){
            if(x>largest){
                secondLargest=largest;
                largest=x;
            }
            if(x>secondLargest&&x<largest) secondLargest=x;
        }
        System.out.println(secondLargest);
    }
}
