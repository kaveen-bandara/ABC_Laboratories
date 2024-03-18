package com.ABC.Laboratories.Patient;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PatientRepository extends MongoRepository<Patient, ObjectId> {
    Optional<Patient> findPatientByPatientId(String id);
}
