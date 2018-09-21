/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Hirer.HirerDao;
import Job.JobDao;
import Model.Job;
import java.util.List;

/**
 *
 * @author tagiz
 */
public class JobServiceImpl implements JobService {
    
      
     private JobDao jobdao;

     public JobServiceImpl(JobDao jobdao) {
        super();
        this.jobdao = jobdao;
    }

    @Override
    public List<Job> getJobList() throws Exception {     
     return jobdao.getJobList();
    }
    
    
}
