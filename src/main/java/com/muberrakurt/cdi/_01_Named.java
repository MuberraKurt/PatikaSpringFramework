package com.muberrakurt.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


//cdi bean yapısı oluşturuldu.
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {

    private Long namedId;
    private String namedData=" Merhaba Named Cdi Bean";

}
