package com.dummy.springboot.dummyspring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    @Test
    void testMathHappy(){
        Math math = new Math();
        int[] nums = {1,2,3};
        assertEquals(math.calculateSum(nums),6);
    }

    @Test
    void testMathSad(){
        Math math = new Math();
        int[] nums = {1,2,3};
        assertNotEquals(math.calculateSum(nums),5);
    }

}
