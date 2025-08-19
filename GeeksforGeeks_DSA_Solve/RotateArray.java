

public class RotateArray {

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d is larger than n
        
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }
    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

   public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 4; // Number of positions to rotate
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        rotateArr(arr, d);
        
        System.out.println("Array after rotating by " + d + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
   } 
}
