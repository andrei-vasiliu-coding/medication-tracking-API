package com.personal.medicationtrackingapi.controller;

import com.personal.medicationtrackingapi.model.Medication;
import com.personal.medicationtrackingapi.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MedicationController {

    @Autowired
    MedicationService medicationService;

    @GetMapping("/reports")
    public ResponseEntity<List<Medication>> getAllReports() {
        return new ResponseEntity<List<Medication>>(medicationService.getAllReports(), HttpStatus.OK);
    }
}
