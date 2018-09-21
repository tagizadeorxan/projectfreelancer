/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Freelancer;

import Model.Freelancer;
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
public class  FreelancerDaoImpl implements FreelancerDao {

    @Override
    public List<Freelancer> getFreelancerList() throws Exception {
        List<Freelancer> freelancerlist = new ArrayList<Freelancer>();

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT  FreelancerID,FreelancerName, FreelancerSurname, FreelancerEmailAddress, FreelancerPhoneNumber, FreelancerCity, FreelancerDateofBirth, FreelancerPhoto, FreelancerIDcard, FreelancerPhotowithIDcard, FreelancerAbout,FreelancerExperience, FreelancerLinktoFB, FreelancerLinktoSkype  from freelancer\n" +
"where FreelancerActive=1;";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Freelancer freelancer = new Freelancer();

                    freelancer.setID(rs.getLong("FreelancerID"));
                    freelancer.setName(rs.getString("FreelancerName"));
                    freelancer.setSurname(rs.getString("FreelancerSurname"));
                    freelancer.setEmailAddress(rs.getString("FreelancerEmailAddress"));
                    freelancer.setPhoneNumber(rs.getString("FreelancerPhoneNumber"));
                    freelancer.setCity(rs.getString("FreelancerCity"));
                    freelancer.setDateofBirth(rs.getDate("FreelancerDateofBirth"));
                    freelancer.setPhoto(rs.getString("FreelancerPhoto"));
                    freelancer.setPhotoIDcard(rs.getString("FreelancerIDcard"));
                    freelancer.setPhotowithIDcard(rs.getString("FreelancerPhotowithIDcard"));
                    freelancer.setAbout(rs.getString("FreelancerAbout"));
                    freelancer.setExperience(rs.getString("FreelancerExperience"));
                    freelancer.setLinktoFacebook(rs.getString("FreelancerLinktoFB"));
                    freelancer.setLinktoSkype(rs.getString("FreelancerLinktoSkype"));
                    

                    freelancerlist.add(freelancer);
                    
                }
                
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {

        } finally {
            utility.close(c, ps, rs);
        }

        return freelancerlist;
    }

    @Override
      public boolean addNewFreelancer(Freelancer freelancer) throws Exception {
   
   boolean result = false;    
        Connection c = null;
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO Freelancer (FreelancerName, FreelancerSurname, FreelancerEmailAddress, FreelancerPhoneNumber, FreelancerCity, FreelancerDateofBirth, FreelancerPhoto, FreelancerIDcard, FreelancerPhotowithIDcard, FreelancerAbout,FreelancerExperience, FreelancerLinktoFB, FreelancerLinktoSkype)\n" +
"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                
                    ps.setString(1, freelancer.getName());
                    ps.setString(2, freelancer.getSurname());
                    ps.setString(3, freelancer.getEmailAddress());
                    ps.setString(4, freelancer.getPhoneNumber());
                    ps.setString(5, freelancer.getCity());                   
                    ps.setDate(6, freelancer.getDateofBirth());                    
                    ps.setString(7, freelancer.getPhoto());
                    ps.setString(8, freelancer.getPhotoIDcard());
                    ps.setString(9, freelancer.getPhotowithIDcard());
                    ps.setString(10, freelancer.getAbout());
                    ps.setString(11, freelancer.getExperience());
                    ps.setString(12,freelancer.getLinktoFacebook());
                    ps.setString(13, freelancer.getLinktoSkype());
                          
                   
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

    @Override
    public Freelancer getFreelancerByID(Long FreelancerID) throws Exception {
        
Freelancer freelancer = new Freelancer();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT  FreelancerID,FreelancerName, FreelancerSurname, FreelancerEmailAddress, FreelancerPhoneNumber, FreelancerCity, FreelancerDateofBirth, FreelancerPhoto, FreelancerIDcard, FreelancerPhotowithIDcard, FreelancerAbout,FreelancerExperience, FreelancerLinktoFB, FreelancerLinktoSkype  from freelancer\n" +
"where FreelancerActive=1 and FreelancerID=?;";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, freelancer.getID());
                rs = ps.executeQuery();
                if (rs.next()) {
                    
                    freelancer.setID(rs.getLong("FreelancerID"));
                    freelancer.setName(rs.getString("FreelancerName"));
                    freelancer.setSurname(rs.getString("FreelancerSurname"));
                    freelancer.setEmailAddress(rs.getString("FreelancerEmailAddress"));
                    freelancer.setPhoneNumber(rs.getString("FreelancerPhoneNumber"));
                    freelancer.setCity(rs.getString("FreelancerCity"));
                    freelancer.setDateofBirth(rs.getDate("FreelancerDateofBirth"));
                    freelancer.setPhoto(rs.getString("FreelancerPhoto"));
                    freelancer.setPhotoIDcard(rs.getString("FreelancerIDcard"));
                    freelancer.setPhotowithIDcard(rs.getString("FreelancerPhotowithIDcard"));
                    freelancer.setAbout(rs.getString("FreelancerAbout"));
                    freelancer.setExperience(rs.getString("FreelancerExperience"));
                    freelancer.setLinktoFacebook(rs.getString("FreelancerLinktoFB"));
                    freelancer.setLinktoSkype(rs.getString("FreelancerLinktoSkype"));
                    
                    System.out.println(freelancer);
                }
                
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {

        } finally {
            utility.close(c, ps, rs);
        }

        return freelancer;
        
    }

    @Override
    public boolean updateFreelancer(Freelancer freelancer, Long FreelancerID) throws Exception {
       boolean result = false;    
        Connection c = null;
        PreparedStatement ps = null;
        
        String sql = "UPDATE Freelancer SET FreelancerName=?,FreelancerSurname=?, FreelancerEmailAddress=?, FreelancerPhoneNumber=?, FreelancerCity=?, FreelancerDateofBirth=?, FreelancerPhoto=?, FreelancerIDcard=?, FreelancerPhotowithIDcard=?, FreelancerAbout=?,FreelancerExperience=?, FreelancerLinktoFB=?, FreelancerLinktoSkype=?" +
"Where ID=?";
        
        
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                
                    ps.setString(1, freelancer.getName());
                    ps.setString(2, freelancer.getSurname());
                    ps.setString(3, freelancer.getEmailAddress());
                    ps.setString(4, freelancer.getPhoneNumber());
                    ps.setString(5, freelancer.getCity());                   
                    ps.setDate(6, freelancer.getDateofBirth());                    
                    ps.setString(7, freelancer.getPhoto());
                    ps.setString(8, freelancer.getPhotoIDcard());
                    ps.setString(9, freelancer.getPhotowithIDcard());
                    ps.setString(10, freelancer.getAbout());
                    ps.setString(11, freelancer.getExperience());
                    ps.setString(12,freelancer.getLinktoFacebook());
                    ps.setString(13, freelancer.getLinktoSkype());
                    ps.setLong(14,FreelancerID );          
               ps.executeUpdate();
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

    @Override
    public boolean deleteFreelancer(Long FreelancerID) throws Exception {
boolean result = false;    
        Connection c = null;
        PreparedStatement ps = null;
        
        String sql = "UPDATE Freelancer SET FreelancerActive=0" +
"Where ID=?";
        
        
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                
                ps.setLong(1,FreelancerID );          
               ps.executeUpdate();
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
