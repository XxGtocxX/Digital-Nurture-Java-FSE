package com.debanuj;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    public Student() {
        System.out.println("Student Bean Created");
    }

}