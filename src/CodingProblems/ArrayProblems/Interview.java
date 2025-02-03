package CodingProblems.ArrayProblems;
import java.util.HashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
	int[] result=	twoSum(nums,9);
	
	int[] nums2 = {3,2,4};
	int[] result2=	twoSum(nums2,6);
	for(int i:result) {
		System.out.println(i);
	}
	for(int i:result2) {
		System.out.println(i);
	}
		

	}

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    }