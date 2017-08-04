package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenyu on 17-3-7.
 */
public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null) return true;
            map.put(nums[i],0);
        }
        return false;
    }
}
