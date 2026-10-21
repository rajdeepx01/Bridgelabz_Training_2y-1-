package Recurssion.basic;

public class fibbonachi {
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int small1 = fibbo(n-1);
        int small2 = fibbo(n-2);
        return small1 + small2;
    }

    static void main(String[] args) {
        int n =5;
        for(int i=0;i<n;i++){
            System.out.print(fibbo(i)+" ");
        }
    }
}
