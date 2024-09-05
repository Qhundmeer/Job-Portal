package com.jobportal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.dto.Job;

public interface JobRepository extends JpaRepository<Job, Integer>
{

	List<Job> findByLastDateAfter(LocalDate now);

}
