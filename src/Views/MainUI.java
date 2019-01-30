/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.CurrentUser;
import Services.ExceptionMessageDialog;
import Services.ManageOperations.ManageBookings;
import Services.ManageOperations.ManageFacilities;
import Services.ManageOperations.ManageHalls;
import Services.TableModelBuilder;
import Views.ManageBookings.AddBookingsView;
import Views.ManageBookings.SearchBookingsView;
import Views.ManageBookings.UpdateBookingsView;
import Views.ManageHalls.AddHallsView;
import Views.ManageHalls.SearchHallsView;
import Views.ManageHalls.UpdateHallsView;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author JanithWanni
 */
public class MainUI extends javax.swing.JFrame {

    private CurrentUser cu = new CurrentUser();
    private ManageFacilities mf = new ManageFacilities();
    private ManageBookings mb = new ManageBookings();
    private ManageHalls mh = new ManageHalls();

    /**
     * Creates new form MainUI
     */
    public MainUI() {
//        if(!LoginValidator.isLoggedIn()){
//            JOptionPane.showMessageDialog(rootPane, "User not logged in exiting");
//            System.exit(0);
//        }
        initComponents();
        System.out.println(cu.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        welcomeLabel = new javax.swing.JLabel();
        tabView = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hallTable = new javax.swing.JTable();
        addHallBtn = new javax.swing.JButton();
        searchHallBtn = new javax.swing.JButton();
        updateHallBtn = new javax.swing.JButton();
        deleteHallBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        addBookingsBtn = new javax.swing.JButton();
        searchBookingsBtn = new javax.swing.JButton();
        updateBookingBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        facilitiesTable = new javax.swing.JTable();
        updateFacilitiesBtn = new javax.swing.JButton();
        refreshBtnFacility = new javax.swing.JButton();
        searchFacility = new javax.swing.JButton();
        addFacilityBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Welcome, ");

        tabView.setDoubleBuffered(true);

        hallTable.setModel(getHallsTableModel());
        jScrollPane1.setViewportView(hallTable);

        addHallBtn.setText("Add hall");
        addHallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHallBtnActionPerformed(evt);
            }
        });

        searchHallBtn.setText("Search Hall");
        searchHallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHallBtnActionPerformed(evt);
            }
        });

        updateHallBtn.setText("Update Info");
        updateHallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHallBtnActionPerformed(evt);
            }
        });

        deleteHallBtn.setText("Delete Hall");
        deleteHallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHallBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh Table");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addHallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(searchHallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn)
                        .addGap(63, 63, 63)
                        .addComponent(updateHallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(deleteHallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addHallBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(searchHallBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteHallBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateHallBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        tabView.addTab("Manage Hall", jPanel1);

        bookingTable.setModel(getBookingsTableModel());
        jScrollPane2.setViewportView(bookingTable);

        addBookingsBtn.setText("Add Booking");
        addBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookingsBtnActionPerformed(evt);
            }
        });

        searchBookingsBtn.setText("Search Booking");
        searchBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookingsBtnActionPerformed(evt);
            }
        });

        updateBookingBtn.setText("Update Booking");
        updateBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookingBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete booking");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addBookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(searchBookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(confirmBtn)
                        .addGap(46, 46, 46)
                        .addComponent(updateBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBookingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(searchBookingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBookingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        tabView.addTab("Manage Bookings", jPanel2);

        jButton9.setText("Delete Facility");

        facilitiesTable.setModel(getFacilitiesTableModel());
        jScrollPane3.setViewportView(facilitiesTable);

        updateFacilitiesBtn.setText("Update Info");
        updateFacilitiesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFacilitiesBtnActionPerformed(evt);
            }
        });

        refreshBtnFacility.setText("Refresh Table");

        searchFacility.setText("Search Facility");
        searchFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFacilityActionPerformed(evt);
            }
        });

        addFacilityBtn.setText("Add Faciltiy");
        addFacilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacilityBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addFacilityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(searchFacility, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtnFacility)
                        .addGap(63, 63, 63)
                        .addComponent(updateFacilitiesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addFacilityBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(searchFacility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshBtnFacility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateFacilitiesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabView.addTab("Manage Facilites", jPanel3);

        welcomeLabel.setText(welcomeLabel.getText()+cu.getUsername());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(welcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tabView, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(welcomeLabel)
                .addGap(18, 18, 18)
                .addComponent(tabView, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addHallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHallBtnActionPerformed
        // TODO add your handling code here:
        //display the new add hall dialog
        AddHallsView ahv = new AddHallsView();
        int result = JOptionPane.showConfirmDialog(this, ahv, "Add Halls", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            ahv.createHall();
            JOptionPane.showMessageDialog(this, "Hall creation successful");
            try {
                refreshHallTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_addHallBtnActionPerformed

    private void addFacilityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacilityBtnActionPerformed
        // TODO add your handling code here:
        String result = JOptionPane.showInputDialog(rootPane, "Enter the name of the facility");
        if (result != null) {
            String[] values = {result};
            mf.create(values, mf.columnNames);
            try {
                facilitiesTable.setModel(TableModelBuilder.build(mf.read("ALL")));
            } catch (SQLException ex) {
                ex.printStackTrace();
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_addFacilityBtnActionPerformed

    private void searchFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFacilityActionPerformed
        try {
            // TODO add your handling code here:
            String result = JOptionPane.showInputDialog(rootPane, "Enter name of facility to search for");
            if (result.equals("")) {
                facilitiesTable.setModel(TableModelBuilder.build(mf.read("ALL")));
            } else {
                facilitiesTable.setModel(TableModelBuilder.build(mf.read("name like '%" + result + "%'")));
            }
            facilitiesTable.validate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_searchFacilityActionPerformed

    private void updateFacilitiesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFacilitiesBtnActionPerformed
        // TODO add your handling code here:
        if (facilitiesTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Select a row from the table to continue");
        } else {
            String currentValue = facilitiesTable.getValueAt(facilitiesTable.getSelectedRow(), 1).toString();
            String result = JOptionPane.showInputDialog(rootPane, "Enter updated name", currentValue);
            String[] values = {result};
            mf.update(values, mf.columnNames, "facilityid = '" + facilitiesTable.getValueAt(facilitiesTable.getSelectedRow(), 0).toString() + "'");
            try {
                facilitiesTable.setModel(TableModelBuilder.build(mf.read("ALL")));
            } catch (SQLException ex) {
                ex.printStackTrace();
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        }

    }//GEN-LAST:event_updateFacilitiesBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            refreshHallTable();
        } catch (SQLException ex) {
            ExceptionMessageDialog.show(this, ex.getMessage());
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void refreshHallTable() throws SQLException{
            // TODO add your handling code here:
            hallTable.setModel(TableModelBuilder.build(mh.read("ALL")));
       
    }
    private void searchHallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHallBtnActionPerformed
        // TODO add your handling code here:
        SearchHallsView shv = new SearchHallsView();
        int result = JOptionPane.showConfirmDialog(this, shv, "Search Halls", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            ResultSet searchResults = shv.searchHalls();
            try {
                hallTable.setModel(TableModelBuilder.build(searchResults));
            } catch (SQLException ex) {
                ex.printStackTrace();
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_searchHallBtnActionPerformed

    private void updateHallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHallBtnActionPerformed
        // TODO add your handling code here:
        if (hallTable.getSelectedRow() != -1) {
            try {
                int hallid = Integer.parseInt(hallTable.getValueAt(hallTable.getSelectedRow(), 0).toString());
                UpdateHallsView uhv = new UpdateHallsView(hallid);
                int result = JOptionPane.showConfirmDialog(this, uhv, "Update Halls", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    uhv.updateHalls();
                    hallTable.setModel(TableModelBuilder.build(mh.read("ALL")));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a row from the table to update");
        }

    }//GEN-LAST:event_updateHallBtnActionPerformed

    private void deleteHallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHallBtnActionPerformed
        // TODO add your handling code here:
        //delete halls
        if (hallTable.getSelectedRow() != -1) {
            int hallid = Integer.parseInt(hallTable.getValueAt(hallTable.getSelectedRow(), 0).toString());
            int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this hall", "Delete Hall", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                mh.delete("hallid = " + hallid);
                JOptionPane.showMessageDialog(this, "Hall deleted Successfully");
                try {
                    // TODO add your handling code here:
                    hallTable.setModel(TableModelBuilder.build(mh.read("ALL")));
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a row from the table to delete");
        }
    }//GEN-LAST:event_deleteHallBtnActionPerformed

    private void addBookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookingsBtnActionPerformed
        // TODO add your handling code here:
        //add Booking
        AddBookingsView abv = new AddBookingsView();
        int result = JOptionPane.showConfirmDialog(this, abv, "Add booking", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            abv.addBooking();
            try {
               refreshBookingTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_addBookingsBtnActionPerformed

    private void searchBookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookingsBtnActionPerformed
        // TODO add your handling code here:
        SearchBookingsView sbv = new SearchBookingsView();
        int result = JOptionPane.showConfirmDialog(this, sbv,"Search Halls",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(result == JOptionPane.OK_OPTION){
            try {
                ResultSet searchResults = sbv.searchBookings();
                refreshBookingTable();
            } catch (Exception ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_searchBookingsBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        if(bookingTable.getSelectedRow() != -1){
            String bookingid = bookingTable.getValueAt(bookingTable.getSelectedRow(),0).toString();
            int confirmed = Integer.parseInt(bookingTable.getValueAt(bookingTable.getSelectedRow(),3).toString());
            Object[] values = {confirmed == 1 ? 0:1};
            String[] columnNames = {"confirmed"};
            mb.update(values, columnNames, "bookingid = "+bookingid);
            try {
                refreshBookingTable();
            } catch (SQLException ex) {
                ExceptionMessageDialog.show(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if(bookingTable.getSelectedRow() != -1){
            String bookingid = bookingTable.getValueAt(bookingTable.getSelectedRow(), 0).toString();
            int result = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete the selected booking");
            if(result == JOptionPane.OK_OPTION){
                try {
                    mb.delete("bookingid = "+bookingid);
                    refreshBookingTable();
                } catch (SQLException ex) {
                    ExceptionMessageDialog.show(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookingBtnActionPerformed
        // TODO add your handling code here:
        
        if(bookingTable.getSelectedRow() != -1){
            try {
                String bookingid = bookingTable.getValueAt(bookingTable.getSelectedRow(),0).toString();
                UpdateBookingsView ubv = new UpdateBookingsView(Integer.parseInt(bookingid));
                int result = JOptionPane.showConfirmDialog(this,ubv,"Update Bookings",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                if(result == JOptionPane.OK_OPTION){
                    ubv.updateBookings();
                    refreshBookingTable();
                }
            } catch (SQLException ex) {
                ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_updateBookingBtnActionPerformed

    private void refreshBookingTable() throws SQLException{
        bookingTable.setModel(TableModelBuilder.build(mb.read("ALL")));
    }
    private TableModel getHallsTableModel() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) TableModelBuilder.build(mh.read("ALL"));
            return dtm;
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            return null;
        }
    }

    private TableModel getFacilitiesTableModel() {
        try {

            return TableModelBuilder.build(mf.read("ALL"));
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            return null;
        }
    }

    private TableModel getBookingsTableModel() {
        try {

            return TableModelBuilder.build(mb.read("ALL"));
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
            return null;
        }
    }

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookingsBtn;
    private javax.swing.JButton addFacilityBtn;
    private javax.swing.JButton addHallBtn;
    private javax.swing.JTable bookingTable;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteHallBtn;
    private javax.swing.JTable facilitiesTable;
    private javax.swing.JTable hallTable;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refreshBtnFacility;
    private javax.swing.JButton searchBookingsBtn;
    private javax.swing.JButton searchFacility;
    private javax.swing.JButton searchHallBtn;
    private javax.swing.JTabbedPane tabView;
    private javax.swing.JButton updateBookingBtn;
    private javax.swing.JButton updateFacilitiesBtn;
    private javax.swing.JButton updateHallBtn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

}
