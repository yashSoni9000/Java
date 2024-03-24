public class TwoMatrices {
    public static void main(String[] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]=new int[a.length][a.length];

        //adding
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                c[i][j]=a[i][j]+b[i][j];
//            }
//        }

        // multiplying
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                int sum=0;
                for(int k=0;k<a[0].length;k++){
                    sum+=a[i][k]*b[k][j];
                }
                c[i][j]=sum;
            }
        }
        for(int[] x :c){
            for(int y:x){
                System.out.format("%02d ",y);
            }
            System.out.println();
        }
    }
}
