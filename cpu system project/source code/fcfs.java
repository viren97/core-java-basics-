import java.util.stream.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viren
 */
public class fcfs extends javax.swing.JFrame {

    /**
     * Creates new form fcfs
     * @param a
     */
    public fcfs(int a) {
        initComponents();
              
       int size = a;
       loadtable(size);
    }

    private fcfs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void loadtable(int size)
{
     DefaultTableModel model=(DefaultTableModel)table.getModel();//to perform operation o table like add row, delete row, data retrive
           table.setModel(model);
           model.setRowCount(0);//to set row blank intially
           Object row[]=new Object[size];
           while(size!=0)
           {
                model.addRow(row);
                size--;
           }
             for(int i=0; i<model.getRowCount(); i++)
                for(int j=0; j<model.getColumnCount(); j++)
                        {  model.setValueAt(0, i,j);
                         
                        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnget = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Process", "Arrival Time", "Burst Time", "ct", "tat", "Witing Time"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnget.setText("Get Waiting Time");
        btnget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("First Come First Serve");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnget)
                        .addGap(142, 416, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnget)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void btngetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        int at[]=new int [model.getRowCount()];
        int bt[]=new int [model.getRowCount()];
        int ct[]=new int [model.getRowCount()];
        int wt[]=new int [model.getRowCount()];
        int tat[]=new int [model.getRowCount()];
        int p[]=new int [model.getRowCount()];
        int n=model.getRowCount();
        for(int i=0; i<model.getRowCount(); i++)
        {
            p[i]=Integer.parseInt(model.getValueAt(i,0).toString());
            at[i]=Integer.parseInt(model.getValueAt(i,1).toString());
            bt[i]=Integer.parseInt(model.getValueAt(i,2).toString());
        }
        int temp;
       for(int i = 0 ; i <n; i++)
		{
			for(int  j=0;  j < n-(i+1) ; j++)
			{
				if( at[j] > at[j+1] )
				{
					temp = at[j];
					at[j] = at[j+1];
					at[j+1] = temp;
					temp = bt[j];
					bt[j] = bt[j+1];
					bt[j+1] = temp;
					temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp;
				}
			}
		}
		
		// finding completion times
		for(int  i = 0 ; i < n; i++)
		{
			if( i == 0)
			{	
				ct[i] = at[i] + bt[i];
			}
			else
			{
				if( at[i] > ct[i-1])
				{
					ct[i] = at[i] + bt[i];
				}
				else
					ct[i] = ct[i-1] + bt[i];
			}
			tat[i] = ct[i] - at[i] ;          // turnaround time= completion time- arrival time
			wt[i] = tat[i] - bt[i] ;          // waiting time= turnaround time- burst time
		              // total turnaround time
		}
		

        for(int i=0; i<model.getRowCount(); i++)
        {  model.setValueAt(at[i], i,1);
            model.setValueAt(p[i], i,0);
            model.setValueAt(bt[i], i,2);
            model.setValueAt(ct[i], i,3);
            model.setValueAt(tat[i], i,4);
            model.setValueAt(wt[i], i,5);
        }

    }//GEN-LAST:event_btngetActionPerformed
  
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
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fcfs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
