package com.muberrakurt.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.ApplicationMap;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value="cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String patika;
    public JsfBean() {
        this.patika = "Spring Boot Eğitimi Hoşgeldiniz";
    }


}
