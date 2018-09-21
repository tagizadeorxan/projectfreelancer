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
import utility.DBHelper;
import utility.utility;

/**
 *
 * @author tagiz
 */
public class test {
    
    public static void main(String[] args) {
        
    
 
    
    Freelancer freelancer = new Freelancer();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT  FreelancerID,FreelancerName, FreelancerSurname, FreelancerEmailAddress, FreelancerPhoneNumber, FreelancerCity, FreelancerDateofBirth, FreelancerPhoto, FreelancerIDcard, FreelancerPhotowithIDcard, FreelancerAbout,FreelancerExperience, FreelancerLinktoFB, FreelancerLinktoSkype  from freelancer\n" +
"where FreelancerActive=1 and FreelancerID=2;";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
              //  ps.setLong(1, freelancer.getID());
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

        } 
        }

  
        
    }

