package com.spring.learning.learningspringframework.enterprise.business;

import com.spring.learning.learningspringframework.enterprise.web.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessServie {
    @Autowired
    private DataService dataService;

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
