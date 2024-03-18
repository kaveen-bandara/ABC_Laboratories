package com.ABC.Laboratories.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> allPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> singlePatientByPatientId(String patientId) {
        return patientRepository.findPatientByPatientId(patientId);
    }
}
