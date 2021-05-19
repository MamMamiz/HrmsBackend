package kodlama.io.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.IJobTitleService;
import kodlama.io.hrms.dataAccess.abstracts.IJobTitleDao;
import kodlama.io.hrms.entites.concrete.JobTitle;

@Service
public class JobTitleManager implements IJobTitleService{

	private IJobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(IJobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

}
