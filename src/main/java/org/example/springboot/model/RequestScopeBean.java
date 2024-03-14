package org.example.springboot.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopeBean {

    public RequestScopeBean() {
        System.out.println("request scope bean");
    }
}
