package com.personal.medicationtrackingapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medication {

    @Id
    @Column(updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", allocationSize = 1)
    private Long id;

    @Column
    private String medicationName;

    @Column
    private int medicationDosage;

}
