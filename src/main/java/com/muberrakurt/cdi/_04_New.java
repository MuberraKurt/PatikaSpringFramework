package com.muberrakurt.cdi;

import com.muberrakurt.StudentDto;
import lombok.Getter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    //üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto=StudentDto.builder()
                .studentId(0L).studentName("student Adi")
                .build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;
}
