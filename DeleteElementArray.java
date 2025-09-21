class DeleteElementArray{
    public static int atbeginning(int arr[],int n){
        int newarr[]=new int[n-1];
        for(int i=1;i<n;i++){
            newarr[i-1]=arr[i];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(newarr[i]+" ");
        }
        return 0;
    }
    public static int atend(int arr[],int n){
        int newarr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            newarr[i]=arr[i];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(newarr[i]+" ");
        }
        return 0;
    }
    public static int atgivenposition(int arr[],int n,int pos){
        int newarr[]=new int[n-1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        for(int i=pos;i<n-1;i++){
            newarr[i]=arr[i+1];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(newarr[i]+" ");
        }
        return 0;
    }    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int pos=2;
        atbeginning(arr,n);
        System.out.println();
        atend(arr,n);
        System.out.println();
        atgivenposition(arr,n,pos);
    }
}