/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.ManageHalls;

import Services.ExceptionMessageDialog;
import Services.ManageOperations.ManageFacilities;
import Services.ManageOperations.ManageHalls;
import Services.ManageOperations.ManageHallsHasFacilities;
import Services.TableModelBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author janith
 */
public class SearchHallsDialog extends javax.swing.JFrame {

    /**
     * Creates new form SearchHallsDialog
     */
    public SearchHallsDialog() {
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

        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        facilitesTable = new javax.swing.JTable();
        hallNameTxt = new javax.swing.JTextField();
        capacitySpnr = new javax.swing.JSpinner();
        priceSpnr = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Price");

        jButton1.setText("Search Halls");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        facilitesTable.setModel(getFacilitiesTableModel());
        facilitesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facilitesTableMouseClicked(evt);
            }
        });
        facilitesTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facilitesTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(facilitesTable);

        hallNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hallNameTxtKeyReleased(evt);
            }
        });

        capacitySpnr.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        capacitySpnr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                capacitySpnrStateChanged(evt);
            }
        });
        capacitySpnr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                capacitySpnrKeyReleased(evt);
            }
        });

        priceSpnr.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(1.0d)));
        priceSpnr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                priceSpnrStateChanged(evt);
            }
        });
        priceSpnr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceSpnrKeyReleased(evt);
            }
        });

        jLabel1.setText("Search Halls");

        jLabel2.setText("Hall Name");

        jLabel3.setText("Capacity");

        jCheckBox1.setEnabled(false);

        jCheckBox3.setEnabled(false);

        jCheckBox2.setEnabled(false);

        jCheckBox4.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(hallNameTxt)
                            .addComponent(capacitySpnr)
                            .addComponent(priceSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hallNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(capacitySpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(priceSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(23, 23, 23)
                        .addComponent(jCheckBox2)
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBox3)
                        .addGap(47, 47, 47)
                        .addComponent(jCheckBox4)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO validate the price and the capacity to be non zero
        String criteria = "";
        if (jCheckBox1.isSelected()) {
            String hallName = hallNameTxt.getText();
            criteria += "name like \"%" + hallName + "%\" or name like \"%" + hallName.toUpperCase() + "%\" or ";
        }
        if (jCheckBox3.isSelected()) {
            int capacity = (int) capacitySpnr.getValue();
            criteria += "capacity <= " + capacity + " or ";
        }
        if (jCheckBox2.isSelected()) {
            double price = (double) priceSpnr.getValue();
            criteria += "price <= " + price + " or ";
        }
        if (jCheckBox4.isSelected()) {
            criteria += "hallid in (select hallid from hall_has_facilities where ";
            for (int i = 0; i < facilitesTable.getRowCount(); i++) {
                if (!facilitesTable.getValueAt(i, 2).toString().equals("0")) {
                    criteria += "facilityid = " + facilitesTable.getValueAt(i, 0) + " or ";
                }
            }

        }
        criteria = jCheckBox4.isSelected() ? criteria.substring(0, criteria.length() - 3) + ")" : criteria.substring(0, criteria.length() - 3);
        System.out.println(criteria);
        ManageHalls mh = new ManageHalls();
        ResultSet read = mh.read(criteria);
        

        JOptionPane.showMessageDialog(rootPane, "Found Results");
    }//GEN-LAST:event_jButton1ActionPerformed
    private TableModel getFacilitiesTableModel() {
        try {
            ManageFacilities mf = new ManageFacilities();
            DefaultTableModel baseModel = (DefaultTableModel) TableModelBuilder.build(mf.read("ALL"));
            Vector v = new Vector();
            for (int i = 0; i < baseModel.getRowCount(); i++) {
                v.add(0);
            }
            baseModel.addColumn("Count", v);
            return baseModel;
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            return null;
        }

    }
    private void hallNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hallNameTxtKeyReleased
        // TODO add your handling code here:
        if (hallNameTxt.getText().equals("")) {
            jCheckBox1.setSelected(false);
        } else {
            jCheckBox1.setSelected(true);
        }
    }//GEN-LAST:event_hallNameTxtKeyReleased

    private void capacitySpnrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capacitySpnrKeyReleased
        // TODO add your handling code here:
        if (capacitySpnr.getValue().toString().equals("0")) {
            jCheckBox2.setSelected(false);
        } else {
            jCheckBox2.setSelected(true);
        }
    }//GEN-LAST:event_capacitySpnrKeyReleased

    private void priceSpnrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceSpnrKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_priceSpnrKeyReleased

    private void facilitesTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facilitesTableKeyReleased
        // TODO add your handling code here:
        jCheckBox4.setSelected(true);
    }//GEN-LAST:event_facilitesTableKeyReleased

    private void capacitySpnrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_capacitySpnrStateChanged
        // TODO add your handling code here:
        if (capacitySpnr.getValue().toString().equals("0")) {
            jCheckBox2.setSelected(false);
        } else {
            jCheckBox2.setSelected(true);
        }
    }//GEN-LAST:event_capacitySpnrStateChanged

    private void priceSpnrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_priceSpnrStateChanged
        // TODO add your handling code here:
        if (priceSpnr.getValue().toString().equals("0")) {
            jCheckBox3.setSelected(false);
        } else {
            jCheckBox3.setSelected(true);
        }
    }//GEN-LAST:event_priceSpnrStateChanged

    private void facilitesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitesTableMouseClicked
        // TODO add your handling code here:        
        for (int i = 0; i < facilitesTable.getRowCount(); i++) {
            if (!facilitesTable.getValueAt(i, 2).toString().equals("0")) {
                jCheckBox4.setSelected(true);
                break;
            } else {
                jCheckBox4.setSelected(false);
            }
        }
    }//GEN-LAST:event_facilitesTableMouseClicked

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
            java.util.logging.Logger.getLogger(SearchHallsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchHallsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchHallsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchHallsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchHallsDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner capacitySpnr;
    private javax.swing.JTable facilitesTable;
    private javax.swing.JTextField hallNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner priceSpnr;
    // End of variables declaration//GEN-END:variables
}
