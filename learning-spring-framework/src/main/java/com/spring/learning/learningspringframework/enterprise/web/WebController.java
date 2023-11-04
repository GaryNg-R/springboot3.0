package com.spring.learning.learningspringframework.enterprise.web;

import com.spring.learning.learningspringframework.enterprise.business.BusinessServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    @Autowired
    private BusinessServie businessServie;

    public long returnValueFromBusinessService(){
        return businessServie.calculateSum();
    }

}

