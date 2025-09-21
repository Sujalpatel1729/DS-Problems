class Mcmacarthy91{
    public static int mcmacarthy(int n){
        if(n>100){
            return n-10;
        }
        return mcmacarthy(mcmacarthy(n+11));
    }
    public static void main(String[] args){
        int n=95;
        System.out.println(mcmacarthy(n));
    }

}