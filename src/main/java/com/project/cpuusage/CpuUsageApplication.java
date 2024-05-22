package com.project.cpuusage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CpuUsageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpuUsageApplication.class, args);
	}

}
