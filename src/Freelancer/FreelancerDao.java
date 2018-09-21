/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Freelancer;

import Model.Freelancer;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author tagiz
 */
public interface FreelancerDao {
   
    List<Freelancer> getFreelancerList() throws Exception;
    
     public boolean addNewFreelancer(Freelancer freelancer) throws Exception;
    
     Freelancer getFreelancerByID (Long FreelancerID) throws Exception;
     
     boolean updateFreelancer (Freelancer freelancer,Long FreelancerID) throws Exception;
     
     boolean deleteFreelancer (Long FreelancerID) throws Exception;
}
