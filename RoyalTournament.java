class RoyalTournament{
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int[][] scores = new int[rows][cols];
        int[][] arr={{10,20,30},{35,10,15},{1,2,3}};
        int sum_max=0;
        int row=0;
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
                sum=sum+arr[i][j];
                if(sum >sum_max){
                    sum_max=sum;
                    row=i;
                }

                
            }
        }
        System.out.println("The winner is player in row: "+row+" with score: "+sum_max);
    }
}