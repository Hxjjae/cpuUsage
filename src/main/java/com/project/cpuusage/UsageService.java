package com.project.cpuusage;

import com.project.cpuusage.entity.UsageEntity;
import com.project.cpuusage.model.UsageDto;
import com.project.cpuusage.model.UsageVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class UsageService {

    private final UsageRepository repository;

    public void insUsage(double usage) {
        UsageEntity entity = new UsageEntity();

        entity.setCpuUsage(usage);
        entity.setDate(LocalDateTime.now());

        repository.save(entity);

    }

    public List<UsageEntity> selCpuUsage(LocalDateTime startedTime, LocalDateTime endedTime) {
        return repository.findByDateBetween(startedTime, endedTime);
    }
}
