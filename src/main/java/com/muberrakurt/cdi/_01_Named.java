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

    public Long getNamedId() {
        return namedId;
    }

    public void setNamedId(Long namedId) {
        this.namedId = namedId;
    }

    public String getNamedData() {
        return namedData;
    }

    public void setNamedData(String namedData) {
        this.namedData = namedData;
    }
}
