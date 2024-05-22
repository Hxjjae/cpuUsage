package com.project.cpuusage.model;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsageVo {
    private Long iCpuUsage;
    private LocalDateTime date;
    private double cpuUsage;
}
