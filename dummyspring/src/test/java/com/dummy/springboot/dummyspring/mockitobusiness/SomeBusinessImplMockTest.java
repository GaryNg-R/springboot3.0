package com.dummy.springboot.dummyspring.mockitobusiness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {
    @Test
    void TestWithStubOldSchool(){
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});

        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
        int result = business.findTheGreatestFromAllData();
        assertEquals(25,result);
    }
}



