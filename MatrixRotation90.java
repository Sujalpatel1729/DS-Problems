class MatrixRotation90{
    public static void main(String[] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int newmatrix[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newmatrix[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}