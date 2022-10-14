package com.example.omis_project.web;

import com.example.omis_project.Doctors;
import com.example.omis_project.OmisDoctors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.omis_project.Doctors.Type;
import com.example.omis_project.Omis;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("omisDoctors")
public class AppointmentOmisController {
    @ModelAttribute
    public void addDoctorsToModel(Model model) {
        List<Doctors> doctors = Arrays.asList(
                new Doctors("FLTO", "13:00", Type.AMINA),
                new Doctors("COTO", "15:30", Type.AMINA),
                new Doctors("GRBF", "16:00", Type.AMINA),
                new Doctors("CARN", "11:15", Type.BAYAN),
                new Doctors("TMTO", "12:00", Type.BAYAN),
                new Doctors("LETC", "13:45", Type.BAYAN),
                new Doctors("CHED", "14:30", Type.BAYAN),
                new Doctors("JACK", "13:45", Type.TIMUR),
                new Doctors("SLSA", "15:00", Type.TIMUR),
                new Doctors("SRCR", "17:15", Type.TIMUR)
        );

        Type[] types = Doctors.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(doctors, type));
        } }
    @ModelAttribute(name = "omisDoctors")
    public OmisDoctors order() {
        return new OmisDoctors();
    }
    @ModelAttribute(name = "omiss")
    public Omis omiss() {
        return new Omis();
    }
    @GetMapping
    public String showAppointmentForm() {
        return "design";
    }

    @PostMapping
    public String processOmis(Omis omiss,
                              @ModelAttribute OmisDoctors omisDoctors) {
        omisDoctors.addOmis(omiss);
        log.info("Processing omiss: {}", omiss);
        return "redirect:/apptodoctor/current";
    }

    private Iterable<Doctors> filterByType(
            List<Doctors> doctors, Type type) {
        return doctors
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }

    }
