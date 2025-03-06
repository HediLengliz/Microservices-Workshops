package com.jobsae.jobsae6;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class JobSae6Application {

	public static void main(String[] args) {
		SpringApplication.run(JobSae6Application.class, args);
	}
	@Bean
	ApplicationRunner init(JobRepository jobRepository) {
		return (args) -> {
			// save
			jobRepository.save(new Job("Service Financier", true));
			jobRepository.save(new Job("Service Info", false));
			jobRepository.save(new Job("Service RH", false));
			// fetch
			jobRepository.findAll().forEach(System.out::println);
		};
	}
}
