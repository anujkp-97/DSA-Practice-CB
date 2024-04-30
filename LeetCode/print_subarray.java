package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class print_subarray {
   public static void printSubarrays(int[] nums) {
        generateSubarrays(nums, 0, new ArrayList<>());
    }

    private static void generateSubarrays(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            if (!current.isEmpty()) {
                System.out.println(current);
            }
            return;
        }

        // Include the current element
        current.add(nums[index]);
        generateSubarrays(nums, index + 1, current);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubarrays(nums, index + 1, current);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        printSubarrays(arr);
    }
    
}
