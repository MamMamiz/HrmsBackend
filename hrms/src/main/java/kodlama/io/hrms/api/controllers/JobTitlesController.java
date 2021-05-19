package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.IJobTitleService;
import kodlama.io.hrms.entites.concrete.JobTitle;

@RestController
@RequestMapping ("/api/jobtitles")	
public class JobTitlesController {
	
	private IJobTitleService jobTitleService;

	@Autowired
	public JobTitlesController(IJobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		
		return this.jobTitleService.getAll();
	}

}
