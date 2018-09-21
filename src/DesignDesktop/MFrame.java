/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignDesktop;

import Freelancer.FreelancerDao;
import Freelancer.FreelancerDaoImpl;
import Hirer.HirerDao;
import Hirer.HirerDaoImpl;
import Job.JobDao;
import Job.JobDaoImpl;
import Model.Freelancer;
import Model.Hirer;
import Model.Job;
import Service.FreelancerServiceImpl;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Service.FreelancerService;
import Service.HirerService;
import Service.HirerServiceImpl;
import Service.JobService;
import Service.JobServiceImpl;
import java.nio.channels.AsynchronousFileChannel;
import javax.swing.JOptionPane;

/**
 *
 * @author tagiz
 */
public  class MFrame extends javax.swing.JFrame {

    FreelancerDao freelancer = new FreelancerDaoImpl();
    FreelancerService freelancerservice = new FreelancerServiceImpl(freelancer);
    HirerDao hirer = new HirerDaoImpl();
    HirerService hirerservice = new HirerServiceImpl(hirer);
    JobDao job = new JobDaoImpl();
    JobService jobservice = new JobServiceImpl (job);
    String globalBtnName = null;

    public MFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FreelancerListBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Hirersbtn = new javax.swing.JButton();
        JobsBtn = new javax.swing.JButton();
        NewFreelancerBtn = new javax.swing.JButton();
        NewHirerBtn = new javax.swing.JButton();
        NewJobBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FreelancerListBtn.setText("Call Freelancers all data");
        FreelancerListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreelancerListBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(FreelancerListBtn)
                .addGap(124, 124, 124)
                .addComponent(EditBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FreelancerListBtn))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Hirersbtn.setText("Call Hirer all data");
        Hirersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HirersbtnActionPerformed(evt);
            }
        });

        JobsBtn.setText("Call Job all data");
        JobsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsBtnActionPerformed(evt);
            }
        });

        NewFreelancerBtn.setText("New Freelancer");
        NewFreelancerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFreelancerBtnActionPerformed(evt);
            }
        });

        NewHirerBtn.setText("NewHirer");
        NewHirerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewHirerBtnActionPerformed(evt);
            }
        });

        NewJobBtn.setText("NewJob");
        NewJobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewJobBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JobsBtn)
                    .addComponent(Hirersbtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NewJobBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewHirerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewFreelancerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hirersbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JobsBtn)
                        .addGap(33, 33, 33)
                        .addComponent(NewFreelancerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewHirerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewJobBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FreelancerListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreelancerListBtnActionPerformed
        globalBtnName = "freelancer";
        showFreelancerList();
        

    }//GEN-LAST:event_FreelancerListBtnActionPerformed

    private void HirersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HirersbtnActionPerformed
 globalBtnName = "hirer";
        showHirerList();
    }//GEN-LAST:event_HirersbtnActionPerformed

    private void JobsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobsBtnActionPerformed
globalBtnName = "job";
    showJobList();
        
        
    }//GEN-LAST:event_JobsBtnActionPerformed

    private void NewFreelancerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFreelancerBtnActionPerformed
     AddFreelancer addframe = new AddFreelancer();
     addframe.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_NewFreelancerBtnActionPerformed

    private void NewHirerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewHirerBtnActionPerformed
        AddHirer addhirer = new AddHirer();
        addhirer.setVisible(true);
    }//GEN-LAST:event_NewHirerBtnActionPerformed

    private void NewJobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewJobBtnActionPerformed
        AddJob addjob = new AddJob();
        addjob.setVisible(true);
        
    }//GEN-LAST:event_NewJobBtnActionPerformed
   
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
       int selectedRowIndex = jTable1.getSelectedRow();
       Long selectedRow = (Long) jTable1.getValueAt(selectedRowIndex, 0);
       
      switch (globalBtnName) {
          case "freelancer":
              EditFreelancerFrame eff = new EditFreelancerFrame(selectedRow);
              eff.setVisible(true);
              break;
          case "hirer":
              
              break;
          case "job":
              
              break;
              default:
              JOptionPane.showMessageDialog(null, "Choose menu");
              break;
              
          
      }
      
    }//GEN-LAST:event_EditBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
if (evt.getClickCount()==2) {
    EditBtnActionPerformed(null);
}
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton FreelancerListBtn;
    private javax.swing.JButton Hirersbtn;
    private javax.swing.JButton JobsBtn;
    private javax.swing.JButton NewFreelancerBtn;
    private javax.swing.JButton NewHirerBtn;
    private javax.swing.JButton NewJobBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void showFreelancerList() {
        try {
            List<Freelancer> freelancerlist = freelancerservice.getFreelancerList();
            DefaultTableModel model = new DefaultTableModel();
            
            jTable1.setModel(model);
            
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("E-mail Address");
            model.addColumn("Phone Number");
            model.addColumn("City");
            model.addColumn("Date of Birth");
            model.addColumn("Photo");
            model.addColumn("ID card");
            model.addColumn("Photo with ID card");
            model.addColumn("About");
            model.addColumn("Experience");
            model.addColumn("Link to Facebook");
            model.addColumn("Link to Skype");
            // Hide ID:
     //    jTable1.getColumnModel().getColumn(0).setMinWidth(0);
       //     jTable1.getColumnModel().getColumn(0).setWidth(0);
         //   jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
          ;

            for (Freelancer freelancer : freelancerlist) {
                Object[] data = new Object[]{
                    freelancer.getID(),
                    freelancer.getName(),
                    freelancer.getSurname(),
                    freelancer.getEmailAddress(),
                    freelancer.getPhoneNumber(),
                    freelancer.getCity(),
                    freelancer.getDateofBirth(),
                    freelancer.getPhoto(),
                    freelancer.getPhotoIDcard(),
                    freelancer.getPhotowithIDcard(),
                    freelancer.getAbout(),
                    freelancer.getExperience(),
                    freelancer.getLinktoFacebook(),
                    freelancer.getLinktoSkype()
                    
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    

    private void showHirerList() {
 try {
            List<Hirer> hirerlist = hirerservice.getHirerList();
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn ("ID");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Email");
            model.addColumn("Phone number");
            model.addColumn("City");
            model.addColumn("Date of Birth");
            model.addColumn("Photo");
            model.addColumn("About");
            model.addColumn("Link to Facebook");
            model.addColumn("Link to Skype");
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            

            for (Hirer hirer : hirerlist) {
                Object[] data = new Object[]{
                    hirer.getID(),
                    hirer.getName(),
                    hirer.getSurname(),
                    hirer.getEmailAddress(),
                    hirer.getPhoneNumber(),
                    hirer.getCity(),
                    hirer.getDateofBirth(),
                    hirer.getPhoto(),
                    hirer.getAbout(),
                    hirer.getLinktoFacebook(),
                    hirer.getLinktoSkype()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showJobList() {
try {
            List<Job> joblist = jobservice.getJobList();
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);

            model.addColumn("Budget");
            model.addColumn("Details");
            

            for (Job job : joblist) {
                Object[] data = new Object[]{
                    job.getBudget(),
                    job.getDetails()

                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    }
    

        


