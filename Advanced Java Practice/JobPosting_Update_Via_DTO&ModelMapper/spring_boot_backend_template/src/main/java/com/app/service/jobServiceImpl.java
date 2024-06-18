package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ApiResponse;
import com.app.dao.jobRepository;
import com.app.entites.JobPosting;
import com.app.entites.JobPostingDTO;

@Service
@Transactional
public class jobServiceImpl implements jobService {
	@Autowired
	jobRepository jobrepo;
	
	@Autowired
	ModelMapper mapper;
	
	
	public JobPosting addNewJob(JobPosting posting) {
			return jobrepo.save(posting);
	}
	
	public ApiResponse updateJob(JobPostingDTO postingdto, Long jid) {
		String msg="failed";
		if(jobrepo.existsById(jid)) {
			JobPosting posting=jobrepo.findById(jid).orElse(null);
			mapper.map(postingdto,posting);
			jobrepo.save(posting);
			msg="success";
		}
		return new ApiResponse(msg);
	}
	
    public ApiResponse deleteJob(Long jid) {
    	String msg="Does not exists";
    	if(jobrepo.existsById(jid)) {
    		jobrepo.deleteById(jid);
    		msg="Deleted";
    	}
		
		return new ApiResponse(msg);
	}
    
   public List<JobPosting> getallJob() {
		
		return jobrepo.findAll();
	}

    
    
	
	

}
