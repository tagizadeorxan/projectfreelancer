/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Job;


import Model.Hirer;
import Model.Job;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utility.DBHelper;
import utility.utility;

/**
 *
 * @author tagiz
 */
public class JobDaoImpl implements JobDao {

    @Override
    public List<Job> getJobList() throws Exception {
        List<Job> joblist = new ArrayList<Job> ();
		
		
		Connection c=null;
		PreparedStatement ps =null;
		ResultSet rs = null;	
		String sql = "select JobBudget,JobDetails from jobber.job\n" +
"where JobActive=1;";
		try {
			c = DBHelper.getConnection();
			if (c!= null) {
				ps = c.prepareStatement(sql);
				rs=ps.executeQuery();
				while (rs.next()) {
				Job job = new Job();
                          job.setBudget(rs.getInt("JobBudget"));
                          job.setDetails(rs.getString("JobDetails"));
		  
				   joblist.add(job);
				}
                                
                                
			} else {
				System.out.println("Connection is null!");
			}
				
		} catch (Exception e) {
			
		} finally {
                    utility.close(c, ps, rs);
		}
		

        
        return joblist;

        
        
    }

    @Override
    public boolean addNewJob(Job job) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
