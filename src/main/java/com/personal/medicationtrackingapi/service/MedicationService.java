package com.personal.medicationtrackingapi.service;

import com.personal.medicationtrackingapi.model.Medication;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MedicationService {

    List<Medication> getAllMedications();
    Medication postMedication(Medication medication);
    ResponseEntity<Medication> updateMedicationById(Long id, Medication medication);
    ResponseEntity<String> deleteMedicationById(Long id);
}
