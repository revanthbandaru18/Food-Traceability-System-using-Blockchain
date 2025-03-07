package com.mycompany.blockchain;

public class Supply_Chain_App extends javax.swing.JFrame {

    /**
     * Creates new form Supply_Chain_App
     */
    public Supply_Chain_App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        startbtn = new javax.swing.JButton();
        defectivebtn = new javax.swing.JButton();
        blockbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Supply Chain");
        setMinimumSize(new java.awt.Dimension(996, 399));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        startbtn.setText("Start Supply Chain");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });
        jPanel3.add(startbtn);
        startbtn.setBounds(150, 30, 690, 40);

        defectivebtn.setText("Check Defective");
        defectivebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defectivebtnActionPerformed(evt);
            }
        });
        jPanel3.add(defectivebtn);
        defectivebtn.setBounds(150, 150, 690, 40);

        blockbtn.setText("View Blocks");
        blockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockbtnActionPerformed(evt);
            }
        });
        jPanel3.add(blockbtn);
        blockbtn.setBounds(150, 90, 690, 40);

        jPanel1.add(jPanel3, "card2");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 112, 996, 405);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Klein Text Trial Book", 1, 36)); // NOI18N
        jLabel1.setText("FOOD SUPPLY CHAIN TRACEABILITY SYSTEM");

        jLabel2.setFont(new java.awt.Font("Klein Text Trial Book", 0, 14)); // NOI18N
        jLabel2.setText("DEMO : Food Supply Chain Of Apple");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel2)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 996, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        // TODO add your handling code here:
        try {
            Chain_System obj = new Chain_System();
            
        }catch(Exception ex)
        {
            
         }
    }//GEN-LAST:event_startbtnActionPerformed

    private void defectivebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defectivebtnActionPerformed
        // TODO add your handling code here:
        defective ob = new defective(null,true);
        ob.setVisible(true);
    }//GEN-LAST:event_defectivebtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        blockbtn.setEnabled(true);
        defectivebtn.setEnabled(true);
    }//GEN-LAST:event_formWindowActivated

    private void blockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockbtnActionPerformed
        // TODO add your handling code here:
        viewBlocks ob = new viewBlocks(null,true);
        ob.setVisible(true);
    }//GEN-LAST:event_blockbtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supply_Chain_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supply_Chain_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supply_Chain_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supply_Chain_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supply_Chain_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton blockbtn;
    public static javax.swing.JButton defectivebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton startbtn;
    // End of variables declaration//GEN-END:variables
}
