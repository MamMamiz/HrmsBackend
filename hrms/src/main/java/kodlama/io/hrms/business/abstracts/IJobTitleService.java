package kodlama.io.hrms.business.abstracts;

import java.util.List; 

import kodlama.io.hrms.entites.concrete.JobTitle;


public interface IJobTitleService {
	
	List<JobTitle> getAll();
}
