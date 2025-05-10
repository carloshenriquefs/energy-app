package br.com.fiap.energy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_daily_report_log")
public class DailyReportLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DAILY_REPORT")
    @SequenceGenerator(
            name = "SEQ_DAILY_REPORT",
            sequenceName = "SEQ_DAILY_REPORT",
            allocationSize = 1
    )
    private Long id;
    private LocalDate date;

    @Lob
    private String resumeJson;

    private LocalDateTime createIn;
}
