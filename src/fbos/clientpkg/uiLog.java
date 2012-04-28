/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fbos.clientpkg;

import fbos.FBOSServantInterface;
import fbos.UserAcctInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JFrame;

/**
 *
 * @author Robin
 */
public class uiLog extends javax.swing.JFrame {

    /**
     * Creates new form uiLog
     */
    public uiLog() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        uiLogLab = new javax.swing.JLabel();
        uiNameLab = new javax.swing.JLabel();
        uiPassLab = new javax.swing.JLabel();
        uiNameTF = new javax.swing.JTextField();
        uiNewLab = new javax.swing.JLabel();
        uiLogButt = new javax.swing.JButton();
        uiRegButt = new javax.swing.JButton();
        uiIPAddLab = new javax.swing.JLabel();
        uiIPAddTF = new javax.swing.JTextField();
        uiIPAddButt = new javax.swing.JButton();
        uiExitButt = new javax.swing.JButton();
        uiExitLab = new javax.swing.JLabel();
        uiPWField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uiLogLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiLogLab.setText("User Login");

        uiNameLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiNameLab.setText("User Name");

        uiPassLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiPassLab.setText("Password");

        uiNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiNameTFActionPerformed(evt);
            }
        });

        uiNewLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiNewLab.setText("New User Registration");

        uiLogButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiLogButt.setText("Login");
        uiLogButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiLogButtActionPerformed(evt);
            }
        });

        uiRegButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiRegButt.setText("Registration");
        uiRegButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiRegButtActionPerformed(evt);
            }
        });

        uiIPAddLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiIPAddLab.setText("IP Address of server");

        uiIPAddTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiIPAddTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiIPAddTFActionPerformed(evt);
            }
        });

        uiIPAddButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiIPAddButt.setText("Enter");
        uiIPAddButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiIPAddButtActionPerformed(evt);
            }
        });

        uiExitButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiExitButt.setText("Exit");
        uiExitButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiExitButtActionPerformed(evt);
            }
        });

        uiExitLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiExitLab.setText("Exit Program");

        uiPWField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiPWFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uiPassLab)
                            .addComponent(uiNameLab)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uiLogLab)
                            .addComponent(uiExitLab)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uiIPAddLab)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(uiNewLab)
                                        .addComponent(uiRegButt)
                                        .addComponent(uiExitButt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uiIPAddButt)
                                    .addComponent(uiIPAddTF, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(uiNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(uiLogButt)
                                    .addComponent(uiPWField))))))
                .addContainerGap(568, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiIPAddLab)
                    .addComponent(uiIPAddTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiIPAddButt)
                .addGap(34, 34, 34)
                .addComponent(uiLogLab)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiNameLab)
                    .addComponent(uiNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiPassLab, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiPWField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uiLogButt)
                .addGap(28, 28, 28)
                .addComponent(uiNewLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uiRegButt)
                .addGap(28, 28, 28)
                .addComponent(uiExitLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uiExitButt)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiNameTFActionPerformed

    private void uiLogButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiLogButtActionPerformed
        String uiName, uiPWord;
        uiName = uiNameTF.getText();
        uiPWord = uiPWField.getText();
    //    JFrame Wall= new JFrame ("uiWall");
        
    }//GEN-LAST:event_uiLogButtActionPerformed

    private void uiIPAddButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiIPAddButtActionPerformed
            
       String serverAddress = uiIPAddTF.getText();
       FBOSServantInterface FBOSServer;
       Registry registry;
//       String serverAddress="172.24.8.22";//args[0];
       String serverPort="3232";//args[1];
       String text="useless";//args[2];
       System.out.println("sending "+text+" to "+serverAddress+":"+serverPort);
       try{
           // get the �gregistry�h
           registry=LocateRegistry.getRegistry(serverAddress,(new Integer(serverPort)).intValue());
           // look up the remote object
           FBOSServer=(FBOSServantInterface)(registry.lookup("FBOSServer"));
                      
           // create new account
           UserAcctInterface proxy = FBOSServer.createAccount("DUser", "DPass", "DProf", "DCity", "DComp", "DCol", 2012);
           UserAcctInterface loggedIn = FBOSServer.loginAccount("DUser", "DPass");
           
           if(loggedIn == null) {
               System.out.println("Could not log in");
           }
           else {
               System.out.println("Logged in");
               System.out.println(loggedIn.viewProfile());
           }
           
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_uiIPAddButtActionPerformed

    private void uiIPAddTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiIPAddTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiIPAddTFActionPerformed

    private void uiExitButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiExitButtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_uiExitButtActionPerformed

    private void uiRegButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiRegButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiRegButtActionPerformed

    private void uiPWFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiPWFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiPWFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(uiLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uiLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uiLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uiLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new uiLog().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton uiExitButt;
    private javax.swing.JLabel uiExitLab;
    private javax.swing.JButton uiIPAddButt;
    private javax.swing.JLabel uiIPAddLab;
    private javax.swing.JTextField uiIPAddTF;
    private javax.swing.JButton uiLogButt;
    private javax.swing.JLabel uiLogLab;
    private javax.swing.JLabel uiNameLab;
    private javax.swing.JTextField uiNameTF;
    private javax.swing.JLabel uiNewLab;
    private javax.swing.JPasswordField uiPWField;
    private javax.swing.JLabel uiPassLab;
    private javax.swing.JButton uiRegButt;
    // End of variables declaration//GEN-END:variables
}
