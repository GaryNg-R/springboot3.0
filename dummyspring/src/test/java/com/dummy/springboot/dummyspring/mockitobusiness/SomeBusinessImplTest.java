package com.dummy.springboot.dummyspring.mockitobusiness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {




    @Test
    void TestWithStubOldSchool(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25,result);
    }
}


class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{25,15,5};
    }
}