/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobber_proje;

import DesignDesktop.MFrame;



/**
 *
 * @author tagiz
 */
public class Jobber_Proje  {
    
 
    
    public static void main(String[] args) {
        
   
       
        
    try {
        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }
     
 MFrame mainframe = new MFrame();
        mainframe.setVisible(true);
        
    
    } catch (Exception e) {
        e.printStackTrace();
        
    }

    }   

    
    
    
   
        
    }
    

