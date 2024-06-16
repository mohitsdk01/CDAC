package com.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.entities.Job;
import com.jobs.service.JobService;

@RestController
@RequestMapping("/jobPostings")
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@PostMapping
	public ResponseEntity<?> createNewJob(@RequestBody Job job){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(jobService.createNewJob(job));
	}
	
	@PutMapping("/jobPostings/{jobId}")
	public ResponseEntity<?> updateJobDetails
	(@PathVariable Long jobId, @RequestBody Job job){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(jobService.updateJobDetails(jobId, job));
	}
	
	@DeleteMapping("/jobPostings/{jobId}")
	public ResponseEntity<?> deleteJob(@PathVariable Long jobId){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(jobService.deleteJob(jobId));
	}
	
	@GetMapping
	public List<Job> getAllJobs(){
		return jobService.getAllJobs();
	}
}
