package com.project.cpuusage.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class UsageInsRes {
    private Long iCpuUsage;
    private LocalDateTime date;
    private double cpuUsage;
}
