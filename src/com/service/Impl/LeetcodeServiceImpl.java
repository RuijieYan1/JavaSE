package com.service.Impl;

import com.service.LeetcodeService;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeServiceImpl implements LeetcodeService {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
