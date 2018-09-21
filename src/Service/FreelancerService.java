/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Freelancer;
import Model.Hirer;
import java.util.List;


public interface FreelancerService {
    
    List<Freelancer> getFreelancerList() throws Exception;
     public boolean addNewFreelancer(Freelancer freelancer) throws Exception;
Freelancer getFreelancerByID (Long FreelancerID) throws Exception;
     
     boolean updateFreelancer (Freelancer freelancer,Long FreelancerID) throws Exception;
     
     boolean deleteFreelancer (Long FreelancerID) throws Exception;

}
