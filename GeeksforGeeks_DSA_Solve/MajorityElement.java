import java.util.*;

class MajorityElement {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int limit = n / 3;
        
        // Find numbers with frequency > n/3
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > limit) {
                result.add(entry.getKey());
            }
        }
        
        // Sort the result
        Collections.sort(result);
        return result;
    }



    public static void main(String[] args) {
    MajorityElement solution = new MajorityElement();
        
        // Test cases
        int[] arr1 = {3, 2, 3};
        System.out.println("Input: [3, 2, 3]");
        System.out.println("Output: " + solution.findMajority(arr1));
        
        int[] arr2 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println("\nInput: [1, 1, 1, 3, 3, 2, 2, 2]");
        System.out.println("Output: " + solution.findMajority(arr2));
        
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("\nInput: [1, 2, 3, 4, 5]");
        System.out.println("Output: " + solution.findMajority(arr3));
        
        // You can add more test cases here
    }
}