package com.dummy.springboot.dummyspring;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DummyTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }

}
