package com.jobs.service;

import java.util.List;

import com.jobs.dto.ApiResponse;
import com.jobs.entities.Job;

public interface JobService {
	ApiResponse createNewJob(Job job);
	ApiResponse updateJobDetails(Long jobId, Job job);
	ApiResponse deleteJob(Long jobId);
	List<Job> getAllJobs();
}
