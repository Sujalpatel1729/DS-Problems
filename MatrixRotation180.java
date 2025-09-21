class MatrixRotation180{
    public static void main(String[] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int rotated[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rotated[n-i-1][m-j-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(rotated[i][j]+" ");
            }
            System.out.println();
        }
    }
}