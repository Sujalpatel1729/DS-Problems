class SparseMatrixRepresentation{
    public static void main(String[] args){
        int arr[][]={{0,0,3,0},
                     {0,0,5,7},
                     {0,0,0,0},
                     {0,2,6,0}};
        int count=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]!=0){
                    count++;
                }
            }
        }
        int sparse[][]=new int[count+1][3];
        sparse[0][0]=4;
        sparse[0][1]=4;
        sparse[0][2]=count;
        int k=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]!=0){
                    sparse[k][0]=i;
                    sparse[k][1]=j;
                    sparse[k][2]=arr[i][j];
                    k++;
                }
            }
        }
        for(int i=0;i<count+1;i++){
            for(int j=0;j<3;j++){
                System.out.print(sparse[i][j]+" ");
            }
            System.out.println();
        }
    }
}
        