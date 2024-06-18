package com.app.entites;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobPostingDTO {

		private String Cname;
		
		private String location;

		private String description;

		private String requirements;

		private int Salary;
	
		private LocalDate postdate;
		

	

}
