/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Job;
import java.util.List;

/**
 *
 * @author tagiz
 */
public interface JobService {
 
     List<Job> getJobList() throws Exception;
}
