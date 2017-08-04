package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenyu on 17-3-7.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) >= (nums.length+1)/2) result = key;
        }
        return result;
    }
}
