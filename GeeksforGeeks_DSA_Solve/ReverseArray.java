package GeeksforGeeks_DSA_Solve;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        ReverseArray solution = new ReverseArray();
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        solution.reverseArray(arr);
        
        System.out.println("Array after reversing:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
