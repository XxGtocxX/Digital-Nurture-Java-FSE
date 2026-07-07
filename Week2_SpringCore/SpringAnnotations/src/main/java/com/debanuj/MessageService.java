package com.debanuj;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage() {
        return "Hello from Spring Annotations!";
    }

}