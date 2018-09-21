/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Freelancer.FreelancerDao;
import Hirer.HirerDao;
import Job.JobDao;
import Model.Freelancer;
import Model.Hirer;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.List;

/**
 *
 * @author tagiz
 */
public class FreelancerServiceImpl implements FreelancerService {

    private FreelancerDao freelancerDao;
   

    public FreelancerServiceImpl(FreelancerDao freelancerDao) {
        super();
        this.freelancerDao = freelancerDao;
    }

   

    @Override
    public List<Freelancer> getFreelancerList() throws Exception {
    return freelancerDao.getFreelancerList();
    }

    @Override
    public boolean addNewFreelancer(Freelancer freelancer) throws Exception {
return freelancerDao.addNewFreelancer(freelancer);
    }

    @Override
    public Freelancer getFreelancerByID(Long FreelancerID) throws Exception {
    return freelancerDao.getFreelancerByID(FreelancerID);
    }
    

    @Override
    public boolean updateFreelancer(Freelancer freelancer, Long FreelancerID) throws Exception {
return freelancerDao.updateFreelancer(freelancer, FreelancerID);
    }

    @Override
    public boolean deleteFreelancer(Long FreelancerID) throws Exception {
return freelancerDao.deleteFreelancer(FreelancerID);
    }

  

    
     
    
  
}
