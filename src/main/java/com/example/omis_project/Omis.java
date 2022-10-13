package com.example.omis_project;

import lombok.Data;

import java.util.List;

@Data
public class Omis {
    private String name;
    private List<Ingredient> ingredients;
}
