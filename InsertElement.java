class InsertElement{
    public static int beginningOfArray(int arr[],int n,int x){
        int newarr[]=new int[n+1];
        newarr[0]=x;
        for(int i=0;i<n;i++){
            newarr[i+1]=arr[i];
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        return 0;
    }
    public static int endOfArray(int arr[],int n,int x){
        int newarr[]=new int[n+1];
        for(int i=0;i<n;i++){
            newarr[i]=arr[i];
        }
        newarr[n]=x;
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        return 0;
    }public static int givenPosition(int arr[],int n,int x,int pos){
        int newarr[]=new int[n+1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        newarr[pos]=x;
        for(int i=pos;i<n;i++){
            newarr[i+1]=arr[i];
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        return 0;
    }public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int x=6;
        int pos=2;
        beginningOfArray(arr,n,x);
        System.out.println();
        endOfArray(arr,n,x);
        System.out.println();
        givenPosition(arr,n,x,pos);
    }
}
