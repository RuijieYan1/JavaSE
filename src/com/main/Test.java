package com.main;


import com.service.Impl.LeetcodeServiceImpl;
import com.service.LeetcodeService;


public class Test {
    public static void main(String[] args) {
        LeetcodeService service = new LeetcodeServiceImpl();
        boolean flag = service.isPalindrome(121);
        System.out.println(flag);
    }
}