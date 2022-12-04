package com.example.patient.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size (min=4, max=40)
    private String name;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateOfBirth;
    private boolean sick;
    @DecimalMin("100")
    private int score;
}
