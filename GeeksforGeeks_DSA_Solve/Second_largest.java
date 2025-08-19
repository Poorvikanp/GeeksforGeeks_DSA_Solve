

import  java.util.Arrays;
public class Second_largest {
    public static int getSecondLargest(int[] arr) {
    int n=arr.length;
        if(arr.length<2){
            return -1;
        }
        Arrays.sort(arr);
        int l=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=l){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
        
    }
}
