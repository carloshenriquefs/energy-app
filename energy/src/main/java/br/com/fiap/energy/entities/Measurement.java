package br.com.fiap.energy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_measurement")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MEASUREMENT")
    @SequenceGenerator(
            name = "SEQ_MEASUREMENT",
            sequenceName = "SEQ_MEASUREMENT",
            allocationSize = 1
    )
    private Long id;
    private Double whConsumption;
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;
}
