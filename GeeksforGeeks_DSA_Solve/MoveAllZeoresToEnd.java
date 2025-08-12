
public class MoveAllZeoresToEnd {
    public void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int temp;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
         MoveAllZeoresToEnd  solution = new MoveAllZeoresToEnd();
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        solution.pushZerosToEnd(arr);
        
        System.out.println("Array after pushing zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
