/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viren
 */
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class employeeDB extends javax.swing.JFrame {

    /**
     * Creates new form employeeDB
     */
    public employeeDB() {
        initComponents();
        loaddata();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void loaddata()
    {
        
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        table.setModel(model);
        model.setRowCount(0);
        Object row[]=new Object[6];
        try
        {
            Connection con;
            Statement stmt;
            String uid="root";
            String pwd="";
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava2018",uid,pwd);
            stmt=con.createStatement();
            String qry="select * from employee where ename like '"+txtsearch.getText()+"%'";
            ResultSet res= stmt.executeQuery(qry);
            while(res.next())
            {
                row[0]=res.getInt("eid");
                row[1]=res.getString("ename");
                row[2]=res.getInt("eage");
                row[3]=res.getString("gender");
                row[4]=res.getString("edesignation");
                row[5]=res.getInt("salary");
                model.addRow(row);
            }
            
        }
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);    
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        rdiomale = new javax.swing.JRadioButton();
        rdiofemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Employee Detail");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Employee I'd");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Employee Gender ");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Employee Age");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Employee Designation");

        txtid.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txtname.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txtage.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txtdes.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        buttonGroup1.add(rdiomale);
        rdiomale.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        rdiomale.setText("Male");

        buttonGroup1.add(rdiofemale);
        rdiofemale.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        rdiofemale.setText("female");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Employee Salary");

        txtsalary.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        btnsave.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(java.awt.Color.lightGray);

        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee Id", "Employee Name", "Age", "Gender", "Designation", "Salary"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        txtsearch.setBackground(java.awt.Color.lightGray);
        txtsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtsearchCaretUpdate(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jLabel8.setBackground(java.awt.Color.lightGray);
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Search By Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdiomale)
                                        .addGap(55, 55, 55)
                                        .addComponent(rdiofemale))
                                    .addComponent(txtid)
                                    .addComponent(txtname)
                                    .addComponent(txtage)
                                    .addComponent(txtdes)
                                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnsave)
                                .addGap(231, 231, 231)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdiomale)
                                    .addComponent(rdiofemale))
                                .addGap(32, 32, 32)
                                .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addComponent(btnsave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        try
        {
            String name,gender,designation;
            int salary,age,id;
            name=txtname.getText().toUpperCase();
            if(rdiomale.isSelected())
                gender=rdiomale.getText().toUpperCase();
            else
                gender=rdiofemale.getText();
            designation=txtdes.getText().toUpperCase();
            salary= Integer.parseInt(txtsalary.getText());
            age=Integer.parseInt(txtage.getText());
            id=Integer.parseInt(txtid.getText());
            
            Connection con;
            Statement stmt;
            String uid="root";
            String pwd="";
            
                    
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava2018",uid,pwd);
            stmt=con.createStatement();
            String qry="insert into employee (eid,ename,eage,edesignation,gender,salary) values ("+id+",'"+name+"',"+age+",'"+designation+"','"+gender+"',"+salary+")";
            stmt.executeUpdate(qry);
            
            JOptionPane.showMessageDialog(this,"Data Saved Successfully","Status",JOptionPane.INFORMATION_MESSAGE);
            loaddata();
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtsearchCaretUpdate
        // TODO add your handling code here:
        loaddata();
    }//GEN-LAST:event_txtsearchCaretUpdate

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
          DefaultTableModel model=(DefaultTableModel) table.getModel();
        table.setModel(model);
       // model.setRowCount(0);
        String m="MALE";
      
        int i = table.getSelectedRow();
        txtid.setText(model.getValueAt(i,0).toString());
        txtname.setText(model.getValueAt(i,1).toString());
       
       
         txtage.setText(model.getValueAt(i,2).toString());
          if(m.equals(model.getValueAt(i,3) ))
            rdiomale.setSelected(true);
         
          else
            rdiofemale.setSelected(true);  
        txtdes.setText(model.getValueAt(i,4).toString());
        txtsalary.setText(model.getValueAt(i,5).toString());
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(employeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdiofemale;
    private javax.swing.JRadioButton rdiomale;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
