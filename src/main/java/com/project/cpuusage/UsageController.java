package com.project.cpuusage;

import com.project.cpuusage.entity.UsageEntity;
import com.project.cpuusage.model.UsageVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {

    private final UsageService service;

    @GetMapping("/minute")
    public List<UsageEntity> getCpuUsageMin(@RequestParam LocalDateTime start,
                                            @RequestParam LocalDateTime end) {
        return service.selCpuUsage(start, end);
    }

    @GetMapping("/hour")
    public List<UsageVo> getCpuUsageHour (@RequestParam LocalDateTime hour) {
        return null;

    }

    @GetMapping("/day")
    public List<UsageVo> getCpuUsageDay (@RequestParam LocalDateTime day) {
        return null;
    }
}
