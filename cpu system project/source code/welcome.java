/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viren
 */
public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    public welcome() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtsize = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        rdiofcfs = new javax.swing.JRadioButton();
        rdiosjf = new javax.swing.JRadioButton();
        rdiosrt = new javax.swing.JRadioButton();
        rdioprioritynon = new javax.swing.JRadioButton();
        rdiopriorityprem = new javax.swing.JRadioButton();
        rdiorobin = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtsize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsizeActionPerformed(evt);
            }
        });

        btnok.setBackground(new java.awt.Color(255, 102, 153));
        btnok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnok.setText("OK");
        btnok.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 255)));
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        rdiofcfs.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(rdiofcfs);
        rdiofcfs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdiofcfs.setForeground(new java.awt.Color(0, 204, 204));
        rdiofcfs.setText("First Come First Serve");

        rdiosjf.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(rdiosjf);
        rdiosjf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdiosjf.setForeground(new java.awt.Color(0, 204, 204));
        rdiosjf.setText("Shortest Job First");

        rdiosrt.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(rdiosrt);
        rdiosrt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdiosrt.setForeground(new java.awt.Color(0, 204, 204));
        rdiosrt.setText("Shortest Remining Time");

        rdioprioritynon.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(rdioprioritynon);
        rdioprioritynon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdioprioritynon.setForeground(new java.awt.Color(0, 204, 204));
        rdioprioritynon.setText("Priority Non-Preemptive");
        rdioprioritynon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioprioritynonActionPerformed(evt);
            }
        });

        rdiopriorityprem.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(rdiopriorityprem);
        rdiopriorityprem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdiopriorityprem.setForeground(new java.awt.Color(0, 204, 204));
        rdiopriorityprem.setText("Priority Preemptive");

        rdiorobin.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(rdiorobin);
        rdiorobin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdiorobin.setForeground(new java.awt.Color(0, 204, 204));
        rdiorobin.setText("Round Robin");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("CPU SCHEDULING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdiopriorityprem)
                    .addComponent(rdiorobin)
                    .addComponent(rdioprioritynon)
                    .addComponent(rdiosjf)
                    .addComponent(rdiofcfs)
                    .addComponent(rdiosrt))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdiofcfs)
                .addGap(26, 26, 26)
                .addComponent(rdiosjf)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdiosrt)
                    .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdioprioritynon)
                        .addGap(32, 32, 32)
                        .addComponent(rdiopriorityprem)
                        .addGap(31, 31, 31)
                        .addComponent(rdiorobin))
                    .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        
       int a = Integer.parseInt(txtsize.getText());
             
             
        if(rdiofcfs.isSelected())
        {
   
        fcfs f = new fcfs(a);
        f.setVisible(true);
        this.dispose();
        }
        else if(rdiosjf.isSelected())
        {
          
        sjf s = new sjf(a);
        s.setVisible(true);
        this.dispose();  
        }
        else if(rdiosrt.isSelected())
        {
        srt s1 = new srt(a);
        s1.setVisible(true);
        this.dispose();  
        }
        else if (rdioprioritynon.isSelected())
        {
        priorityNon p = new priorityNon(a);
        p.setVisible(true);
        this.dispose();
        }
        else if(rdiopriorityprem.isSelected())
        {
        priorityPrem p1 = new priorityPrem(a);
        p1.setVisible(true);
        this.dispose();
        }
        else
        {
         roundRobin r = new roundRobin(a);
        r.setVisible(true);
        this.dispose(); 
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void rdioprioritynonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioprioritynonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdioprioritynonActionPerformed

    private void txtsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsizeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rdiofcfs;
    private javax.swing.JRadioButton rdioprioritynon;
    private javax.swing.JRadioButton rdiopriorityprem;
    private javax.swing.JRadioButton rdiorobin;
    private javax.swing.JRadioButton rdiosjf;
    private javax.swing.JRadioButton rdiosrt;
    private javax.swing.JTextField txtsize;
    // End of variables declaration//GEN-END:variables
}
