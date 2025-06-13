package com.lbytech.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 启动类测试
 *

 */
//@SpringBootTest
class UserCenterApplicationTests {

    

    @Test
    void testDigest() throws NoSuchAlgorithmException {
        String newPassword = DigestUtils.md5DigestAsHex(("abcd" + "mypassword").getBytes());
        System.out.println(newPassword);
    }


    @Test
    void contextLoads() {

    }




}

class Solution {

    @Test
    public void test(){
        int[] nums = sortedSquares(new int[]{-4,-1,0,3,10});
        for(int i: nums){
            System.out.println(i);
        }
    }
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        for(int k = nums.length-1; k >= 0; k--){
            int i2 = nums[i] * nums[i];
            int j2 = nums[j] * nums[j];
            if(i2 > j2){
                nums[k] = i2;
                i++;
            }
            else{
                nums[k] =j2;
                j--;
            }
        }
        return nums;
    }
}