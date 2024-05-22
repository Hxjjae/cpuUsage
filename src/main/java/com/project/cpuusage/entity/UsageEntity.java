package com.project.cpuusage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Table(name = "usage")
@Entity
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class UsageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, length = 100)
    private Long iCpuUsage;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false, length = 100)
    private double cpuUsage;

}
