/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Job;

import Model.Freelancer;
import Model.Job;
import java.util.List;

/**
 *
 * @author tagiz
 */
public interface JobDao {
    
    List<Job> getJobList() throws Exception;
    
         public boolean addNewJob(Job job) throws Exception;

}
