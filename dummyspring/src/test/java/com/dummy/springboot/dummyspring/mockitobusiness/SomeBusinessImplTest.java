package com.dummy.springboot.dummyspring.mockitobusiness;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplTest {




    @Test
    void TestWithStubOldSchool(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        businessImpl.findTheGreatestFromAllData();
    }
}


class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{25,15,5};
    }
}