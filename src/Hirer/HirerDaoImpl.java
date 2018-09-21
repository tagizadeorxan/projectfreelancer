/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hirer;


import Model.Hirer;
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
public class HirerDaoImpl implements HirerDao {

    @Override
    public List<Hirer> getHirerList() throws Exception {
        List<Hirer>hirerlist = new ArrayList<Hirer> ();
		
		
		Connection c=null;
		PreparedStatement ps =null;
		ResultSet rs = null;	
		String sql = "select HirerID,HirerName, HirerSurname, HirerEmailAddress, HirerPhoneNumber,HirerCity,HirerDateofBirth,HirerPhoto,HirerAbout,HirerLinktoFB,HirerLinktoSkype from hirer\n" +
"where HirerActive=1;";
		try {
			c = DBHelper.getConnection();
			if (c!= null) {
				ps = c.prepareStatement(sql);
				rs=ps.executeQuery();
				while (rs.next()) {
				Hirer hirer = new Hirer();
                                   
                                hirer.setID(rs.getInt("HirerID"));
                                hirer.setName(rs.getString("HirerName"));
                                hirer.setSurname(rs.getString("HirerSurname"));
                                hirer.setEmailAddress(rs.getString("HirerEmailAddress"));
                                hirer.setPhoneNumber(rs.getString("HirerPhoneNumber"));
                                hirer.setCity(rs.getString("HirerCity"));
                                hirer.setDateofBirth(rs.getDate("HirerDateofBirth"));
                                hirer.setPhoto(rs.getString("HirerPhoto"));
                                hirer.setAbout(rs.getString("HirerAbout"));
                                hirer.setLinktoFacebook(rs.getString("HirerLinktoFB"));
                                hirer.setLinktoSkype(rs.getString("HirerLinktoSkype"));
                                                      
                                   		  
				   hirerlist.add(hirer);
				}
                              
			} else {
				System.out.println("Connection is null!");
			}
				
		} catch (Exception e) {
			
		} finally {
                    utility.close(c, ps, rs);
		}
		

        
        return hirerlist;
    }

    @Override
    public boolean addNewHirer(Hirer hirer) throws Exception {
        boolean result = false;    
        Connection c = null;
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO hirer (HirerName, HirerSurname, HirerEmailAddress, HirerPhoneNumber, HirerCity, HirerDateofBirth, HirerPhoto, HirerAbout, HirerLinktoFB, HirerLinktoSkype) \n" +
"VALUES (?,?,?,?,?,?,?,?,?,?);";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                
                    ps.setString(1, hirer.getName());
                    ps.setString(2, hirer.getSurname());
                    ps.setString(3, hirer.getEmailAddress());
                    ps.setString(4, hirer.getPhoneNumber());
                    ps.setString(5, hirer.getCity());
                    ps.setDate(6, hirer.getDateofBirth());
                    ps.setString(7, hirer.getPhoto());
                    ps.setString(8, hirer.getAbout());
                    ps.setString(9, hirer.getLinktoFacebook());
                    ps.setString(10, hirer.getLinktoSkype());
                
               ps.execute();
               result = true;
              
               
                
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {

        } finally {
            //c.commit();
            utility.close(c, ps, null);
        }

       return result;
    }
    
}
