package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ApiResponse;
import com.app.entites.JobPosting;
import com.app.entites.JobPostingDTO;
import com.app.service.jobService;

@RestController
@RequestMapping("/jobPosting")
public class jobController {
	@Autowired
	private jobService job;
	
	@PostMapping("/add")
	public JobPosting addJob(@RequestBody JobPosting jpost) {
		return job.addNewJob(jpost);
	}
	
	@PutMapping("/update/{jid}")
	public ApiResponse updateJob(@RequestBody JobPostingDTO jpostdto,@PathVariable Long jid) {
		return job.updateJob(jpostdto,jid);
	}
	
	@DeleteMapping("/delete/{jid}")
	public ApiResponse deleteJobpost(@PathVariable Long jid) {
		return job.deleteJob(jid);
	}
	

	@GetMapping("/all")
	public List<?> getallJob() {
		return job.getallJob();
	}
	

}
