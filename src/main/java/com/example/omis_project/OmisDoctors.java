package com.example.omis_project;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OmisDoctors {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Omis> tacos = new ArrayList<>();
    public void addOmis(Omis taco) {
        this.tacos.add(taco);
    }
}
