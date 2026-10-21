package Recurssion.basic;

public class Gcd {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else {
            return gcd(b,a%b);
        }
    } public static int lcm(int x,int y){
        return(x /gcd(x,y)*y);
    }

    static void main(String[] args) {
        int a=12;
        int b=10;
        System.out.println(gcd(12,16));
    }
}
