package com.main;


import com.service.Impl.LeetcodeServiceImpl;
import com.service.LeetcodeService;


public class Test {
    public static void main(String[] args) {
        LeetcodeService service = new LeetcodeServiceImpl();
        int[] nums={1,2,3,4,2,1,2};
        int k = service.removeElement(nums,2);
        System.out.println(k);
    }
}