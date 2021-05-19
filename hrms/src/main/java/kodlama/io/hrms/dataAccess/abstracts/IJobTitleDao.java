package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entites.concrete.JobTitle;


public interface IJobTitleDao extends JpaRepository<JobTitle, Integer> {

}
