package org.example.springboot.controller;

import org.example.model.RequestScopeBean;
import org.springframework.web.bind.annootation.GetMapping;
import org.springframework.web.bind.annootation.RestController;

@RestController
public class HwController {

    private RequestScopeBean requestScopeBean;

    public HwController(RequestScopeBean requestScopeBean) {
        this.requestScopeBean = requestScopeBean;
    }

    @GetMapping("/")
    public String HW() {
        StringBuilder b = new StringBuilder();
        b.append("HW!\n\n");
        b.append("First call of the request scoped bean: \n");
        b.append(requestScopeBean.toString());
        b.append("\n\n");
        b.append("Second call of the request scoped bean: \n");
        b.append(requestScopeBean.toString());
        b.append("\n");
        return b.toString();
    }
}
