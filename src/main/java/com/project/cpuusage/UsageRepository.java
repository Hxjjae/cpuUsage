package com.project.cpuusage;

import com.project.cpuusage.entity.UsageEntity;
import com.project.cpuusage.model.UsageVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UsageRepository extends JpaRepository<UsageEntity, Long> {

    List<UsageEntity> findByDateBetween(LocalDateTime startedTime, LocalDateTime endedTime);
}
