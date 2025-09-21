class SumOfN{
    public static int byheadrecurssion(int n){
        if(n==0){
            return 0;
        }
        return n+byheadrecurssion(n-1);
    }
    public static int bytailrecurssion(int n,int sum){
        if(n==0){
            return sum;
        }
        return bytailrecurssion(n-1,sum+n);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(byheadrecurssion(n));
        System.out.println(bytailrecurssion(n,0));
    }
}