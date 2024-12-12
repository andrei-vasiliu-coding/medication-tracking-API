package com.personal.medicationtrackingapi.service;

import com.personal.medicationtrackingapi.model.Medication;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MedicationService {

    List<Medication> getAllMedications();
    ResponseEntity<Medication> findMedicationById(Long id);
    ResponseEntity<Medication> findMedicationByName(String name);
    Medication postMedication(Medication medication);
    ResponseEntity<Medication> updateMedicationById(Long id, Medication medication);
    ResponseEntity<String> deleteMedicationById(Long id);
}
