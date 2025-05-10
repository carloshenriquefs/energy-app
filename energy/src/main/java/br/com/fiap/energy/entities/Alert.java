package br.com.fiap.energy.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_alerts")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ALERT")
    @SequenceGenerator(
            name = "SEQ_ALERT",
            sequenceName = "SEQ_ALERT",
            allocationSize = 1
    )
    private Long id;

    @Enumerated(EnumType.STRING)
    private AlertType alertType;
    private Double value;
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @OneToOne(mappedBy = "alert", cascade = CascadeType.ALL)
    private CorrectionAction correctionAction;

}
