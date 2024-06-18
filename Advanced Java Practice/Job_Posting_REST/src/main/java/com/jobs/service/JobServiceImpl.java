package com.jobs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.custom_exceptions.ResourceNotFoundException;
import com.jobs.dto.ApiResponse;
import com.jobs.entities.Job;
import com.jobs.repository.JobRepository;

@Service
@Transactional
public class JobServiceImpl implements JobService {

	@Autowired
	JobRepository jobRepo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public ApiResponse createNewJob(Job job) {
		if(job != null) {
			jobRepo.save(job);
			return new ApiResponse("Job Posted Successfully...");
		}
		return new ApiResponse("Job Posting Failed!");
	}

	@Override
	public ApiResponse updateJobDetails(Long jobId, Job job) {
		String msg = "Job Updation Failed!!!";
		Job job1 = jobRepo.findById(jobId).orElse(null);
		if(job1 != null) {
			job1.setTitle(job.getTitle());
			job1.setCompanyName(job.getCompanyName());
			job1.setDescription(job.getDescription());
			job1.setLocation(job.getLocation());
			job1.setRequirements(job.getRequirements());
			job1.setSalary(job.getSalary());
			jobRepo.save(job1);
			msg = "Updated Job details!";
		}
		else {
			throw new ResourceNotFoundException("Invalid Job Id!");
		}
		
//		if(jobRepo.existsById(jobId)) {
//	//		jobRepo.save(mapper.map(job, Job.class));
//			jobRepo.save(job);
//			msg = "Updated Job details!";
//		}
		
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse deleteJob(Long jobId) {
		String msg = "Deletion failed!";
		if(jobRepo.existsById(jobId)) {
			jobRepo.deleteById(jobId);
			msg = "Job Deleted id: " + jobId;
		}
		else {
			throw new ResourceNotFoundException("Invalid Job Id!!");
		}
		return new ApiResponse(msg);
	}

	@Override
	public List<Job> getAllJobs() {
		return jobRepo.findAll();
	}

}
