package Recurssion.basic;

import com.sun.source.doctree.SystemPropertyTree;

public class Printnumber {
    public static void printdec(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
        public static void main(String[] args){
            printdec(10);
        }
    }



