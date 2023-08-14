import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Demo02 {
    public int[] Demo02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Demo02 solution = new Demo02();
        int[] indices = solution.Demo02(nums, target);

        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
    }
}