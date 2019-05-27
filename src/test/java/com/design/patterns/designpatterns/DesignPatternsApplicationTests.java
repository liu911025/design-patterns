package com.design.patterns.designpatterns;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternsApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void test_01() {
        String[] result = new String[2];
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i + "";
                    result[1] = j + "";
                }
            }
        }
        String s = Arrays.asList(result).stream().collect(Collectors.joining(","));
        System.out.println(s);
    }
}
