package com.example.omis_project.web;

import java.util.HashMap;
import java.util.Map;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.example.omis_project.Doctors;
import com.example.omis_project.Doctors.Type;

@Component
public class IngredientByIdConverter implements Converter<String, Doctors> {
    private Map<String, Doctors> ingredientMap = new HashMap<>();
    public IngredientByIdConverter() { ingredientMap.put("FLTO",
            new Doctors("FLTO", "13:00", Type.AMINA)); ingredientMap.put("COTO",
            new Doctors("COTO", "15:30", Type.AMINA)); ingredientMap.put("GRBF",
            new Doctors("GRBF", "16:00", Type.AMINA)); ingredientMap.put("CARN",
            new Doctors("CARN", "11:15", Type.BAYAN)); ingredientMap.put("TMTO",
            new Doctors("TMTO", "12:00", Type.BAYAN)); ingredientMap.put("LETC",
            new Doctors("LETC", "13:45", Type.BAYAN)); ingredientMap.put("CHED",
            new Doctors("CHED", "14:30", Type.BAYAN)); ingredientMap.put("JACK",
            new Doctors("JACK", "13:45", Type.TIMUR)); ingredientMap.put("SLSA",
            new Doctors("SLSA", "15:00", Type.TIMUR)); ingredientMap.put("SRCR",
            new Doctors("SRCR", "17:15", Type.TIMUR));
    }

    @Override
    public Doctors convert(String id) {
        return ingredientMap.get(id); }
}

