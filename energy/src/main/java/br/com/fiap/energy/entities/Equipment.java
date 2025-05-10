package br.com.fiap.energy.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EQUIPMENT")
    @SequenceGenerator(
            name = "SEQ_EQUIPMENT",
            sequenceName = "SEQ_EQUIPMENT",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String location;
    private String type;

    @Enumerated(EnumType.STRING)
    private StatusEquipment status;

    private LocalDateTime created_at;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<Measurement> measurements;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<Alert> alerts;

}
