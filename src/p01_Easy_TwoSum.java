import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p01_Easy_TwoSum {
    public static void main(String[] args) {
        int target = 6;
        int[] nums = new int[]{3,2,4};

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> arrayMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (arrayMap.containsKey(target - nums[i])) {
                result[0] = arrayMap.get(target - nums[i]);;
                result[1] = i;
            } else {
                arrayMap.put(nums[i], i);
            }

        }

        return result;
    }
}
