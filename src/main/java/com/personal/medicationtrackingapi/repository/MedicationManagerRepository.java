package com.personal.medicationtrackingapi.repository;

import com.personal.medicationtrackingapi.model.Medication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationManagerRepository extends CrudRepository<Medication, Long> {
}
