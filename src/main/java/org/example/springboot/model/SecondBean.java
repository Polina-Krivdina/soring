package org.example.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    public SecondBean(org.example.springboot.model.PrototypeBean prototypeBean) {
        System.out.println("Second bean created");
        System.out.println("Prototype bean second" + prototypeBean.toString());
    }
}
