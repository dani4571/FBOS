/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fbos.clientpkg;

/**
 *
 * @author User
 */
public class uiSearch extends javax.swing.JFrame {

    /**
     * Creates new form uiSearch
     */
    public uiSearch() {
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

        uiSearchPan = new javax.swing.JPanel();
        uiSerLab = new javax.swing.JLabel();
        uiSearchTF = new javax.swing.JTextField();
        uiCityButt = new javax.swing.JButton();
        uiCollButt = new javax.swing.JButton();
        uiInviteLab = new javax.swing.JLabel();
        uiInviteLKab2 = new javax.swing.JLabel();
        uiInviteTF = new javax.swing.JTextField();
        uiInviteButt = new javax.swing.JButton();
        uiExitButt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        uiNextButt = new javax.swing.JButton();
        uiPrevButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uiSearchPan.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Page"));
        uiSearchPan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        uiSerLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiSerLab.setText("Enter Living City Name or College Name");

        uiSearchTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        uiCityButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiCityButt.setText("Search by City");
        uiCityButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiCityButtActionPerformed(evt);
            }
        });

        uiCollButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiCollButt.setText("Search by College");
        uiCollButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiCollButtActionPerformed(evt);
            }
        });

        uiInviteLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiInviteLab.setText("Invite to be a friend");

        uiInviteLKab2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiInviteLKab2.setText("Enter User Name to be invited as a friend");

        uiInviteTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        uiInviteButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiInviteButt.setText("Invite");
        uiInviteButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiInviteButtActionPerformed(evt);
            }
        });

        uiExitButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiExitButt.setText("Exit Search Page");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        uiNextButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiNextButt.setText("Next Page");

        uiPrevButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uiPrevButt.setText("Previous Page");

        javax.swing.GroupLayout uiSearchPanLayout = new javax.swing.GroupLayout(uiSearchPan);
        uiSearchPan.setLayout(uiSearchPanLayout);
        uiSearchPanLayout.setHorizontalGroup(
            uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uiSearchPanLayout.createSequentialGroup()
                .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uiSearchPanLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uiInviteButt)
                            .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(uiInviteLKab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uiInviteTF))))
                    .addGroup(uiSearchPanLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uiInviteLab)
                            .addComponent(uiExitButt)
                            .addComponent(uiSerLab)
                            .addGroup(uiSearchPanLayout.createSequentialGroup()
                                .addComponent(uiCityButt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uiCollButt))
                            .addComponent(uiSearchTF))))
                .addGap(17, 17, 17)
                .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uiSearchPanLayout.createSequentialGroup()
                        .addComponent(uiNextButt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uiPrevButt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        uiSearchPanLayout.setVerticalGroup(
            uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uiSearchPanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(uiSerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiCityButt)
                    .addComponent(uiCollButt))
                .addGap(47, 47, 47)
                .addComponent(uiInviteLab)
                .addGap(18, 18, 18)
                .addComponent(uiInviteLKab2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uiInviteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uiInviteButt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uiExitButt)
                .addGap(68, 68, 68))
            .addGroup(uiSearchPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(uiSearchPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiPrevButt)
                    .addComponent(uiNextButt))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(uiSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(uiSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiCityButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiCityButtActionPerformed
        String uiCity;
        uiCity = uiSearchTF.getText();
        
        
    }//GEN-LAST:event_uiCityButtActionPerformed

    private void uiCollButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiCollButtActionPerformed
        String uiColl;
        uiColl = uiSearchTF.getText();
        
        
    }//GEN-LAST:event_uiCollButtActionPerformed

    private void uiInviteButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiInviteButtActionPerformed
        String uiInvite;
        uiInvite = uiInviteTF.getText();
        
        
    }//GEN-LAST:event_uiInviteButtActionPerformed

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
            java.util.logging.Logger.getLogger(uiSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uiSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uiSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uiSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new uiSearch().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton uiCityButt;
    private javax.swing.JButton uiCollButt;
    private javax.swing.JButton uiExitButt;
    private javax.swing.JButton uiInviteButt;
    private javax.swing.JLabel uiInviteLKab2;
    private javax.swing.JLabel uiInviteLab;
    private javax.swing.JTextField uiInviteTF;
    private javax.swing.JButton uiNextButt;
    private javax.swing.JButton uiPrevButt;
    private javax.swing.JPanel uiSearchPan;
    private javax.swing.JTextField uiSearchTF;
    private javax.swing.JLabel uiSerLab;
    // End of variables declaration//GEN-END:variables
}
