package Recurssion.basic;
public class FindIndex {
    public static void main(String[] args) {
        int[] arr={4,21,35,69,5,6,4};
        int target=21;
        System.out.println(search(arr,0,target));
    }
    public static int search(int[] arr,int index,int target){
        if(index== arr.length){
            return -1;
        }
        else if (arr[index]==target) {
            return index;
        }
        return search(arr, index+1, target);
    }
}
