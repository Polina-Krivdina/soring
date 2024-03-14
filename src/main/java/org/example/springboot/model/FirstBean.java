package org.example.springboot.model;

import org.springframework.stereotype.Component;
@Component
public class FirstBean {

    private org.example.model.SecondBean secondBean;

    public FirstBean(org.example.model.PrototypeBean prototypeBean) {
        System.out.println("First bean created");
        System.out.println("Prototype bean first" + prototypeBean.toString());

    }

        public void setSecondBean(org.example.model.SecondBean secondBean) {
            this.secondBean = secondBean;
        }
    }
