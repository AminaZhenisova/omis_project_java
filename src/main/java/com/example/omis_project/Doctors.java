package com.example.omis_project;

import lombok.Data;

@Data
public class Doctors {
    private final String id;
    private final String name;
    private final Type type;
    public enum Type {
        AMINA, BAYAN, TIMUR
    }
}
