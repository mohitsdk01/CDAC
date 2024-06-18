package com.app.service;
import java.util.List;

import com.app.dao.ApiResponse;
import com.app.entites.JobPosting;
import com.app.entites.JobPostingDTO;

public interface jobService{
	JobPosting addNewJob(JobPosting posting);
	
	ApiResponse updateJob(JobPostingDTO postingdto, Long jid);
	
	ApiResponse deleteJob(Long Jid);
	
	List<JobPosting> getallJob();

}
