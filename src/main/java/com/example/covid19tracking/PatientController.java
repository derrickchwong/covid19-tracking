package com.example.covid19tracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }

    @PostMapping("/patient")
    public Patient createPatient(@RequestBody Patient patient){

        Assert.notNull(patient.getName(), "Name cannot be empty");

        return patientRepository.save(patient);
    }
}
