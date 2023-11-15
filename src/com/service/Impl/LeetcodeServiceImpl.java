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

    @Override
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int n = x;
        while(n != 0){
            rev = rev*10+n%10;
            n = n/10;
        }
        return x==rev;
    }

    @Override
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}
