/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fbos.clientpkg;

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
        uiPassTF = new javax.swing.JTextField();
        uiNewLab = new javax.swing.JLabel();
        uiLogButt = new javax.swing.JButton();
        uiRegButt = new javax.swing.JButton();

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

        uiPassTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uiNewLab)
                            .addComponent(uiLogLab)
                            .addComponent(uiRegButt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uiPassLab)
                            .addComponent(uiNameLab))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uiNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiLogButt))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(uiLogLab)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiNameLab)
                    .addComponent(uiNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiPassLab, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uiLogButt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(uiNewLab)
                .addGap(18, 18, 18)
                .addComponent(uiRegButt)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiNameTFActionPerformed

    private void uiLogButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiLogButtActionPerformed
        String uiName, uiPass;
        uiName = uiNameTF.getText();
        uiPass = uiPassTF.getText();
        
    }//GEN-LAST:event_uiLogButtActionPerformed

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
    private javax.swing.JButton uiLogButt;
    private javax.swing.JLabel uiLogLab;
    private javax.swing.JLabel uiNameLab;
    private javax.swing.JTextField uiNameTF;
    private javax.swing.JLabel uiNewLab;
    private javax.swing.JLabel uiPassLab;
    private javax.swing.JTextField uiPassTF;
    private javax.swing.JButton uiRegButt;
    // End of variables declaration//GEN-END:variables
}
