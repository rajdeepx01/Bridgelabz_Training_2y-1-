package Recurssion.basic;

import java.sql.SQLOutput;

public class MaximumNumber {
    public static int max(int arr[],int index){
        if(index== arr.length-1){
            return arr[index];
        }
        int small=max(arr,index+1);
        return Math.max(small,arr[index]);
    }
    public static void main(String[] args){
        int[] arr = {2,5,6,3,4};
        System.out.println(max(arr,0));
    }
}
