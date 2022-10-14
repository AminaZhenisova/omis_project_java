package com.example.omis_project;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OmisDoctors {

    private String firstName;
    private String secondName;
    private String middleName;
    private String dateOfBirth;
    private List<Omis> appdoctors = new ArrayList<>();
    public void addOmis(Omis omiss) {
        this.appdoctors.add(omiss);
    }
}
