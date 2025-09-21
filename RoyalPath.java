class RoyalPath{
    public static void main(String[] args){
        int n=3;
        int[][] arr = {
            {10, 20, 30},
            {35, 10, 15},
            {1, 2, 3}
        };
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==n-1){
                    sum+=arr[i][j];
                }
               
            }
            
        }
        System.out.println(sum);
    }
}