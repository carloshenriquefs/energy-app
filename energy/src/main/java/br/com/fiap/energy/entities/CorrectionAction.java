package br.com.fiap.energy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_correction_action")
public class CorrectionAction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CORRECTION_ACTION")
    @SequenceGenerator(
            name = "SEQ_CORRECTION_ACTION",
            sequenceName = "SEQ_CORRECTION_ACTION",
            allocationSize = 1
    )
    private Long id;
    private String description;
    private String responsible;
    private LocalDateTime dateRecord;

    @OneToOne
    @JoinColumn(name = "alert_id")
    private Alert alert;
}
