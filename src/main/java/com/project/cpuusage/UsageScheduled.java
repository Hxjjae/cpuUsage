package com.project.cpuusage;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

@Component
@RequiredArgsConstructor
public class UsageScheduled {

    private final UsageService service;

    @Scheduled(fixedRate = 60000)
    public void cpuUsage() {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();

        com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean) osBean;
        double cpuLoad = os.getCpuLoad() * 100;

        service.insUsage(cpuLoad);
    }

}
