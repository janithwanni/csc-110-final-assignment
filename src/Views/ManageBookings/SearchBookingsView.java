/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.ManageBookings;

import Services.Converters;
import Services.ExceptionMessageDialog;
import Services.ManageOperations.ManageBookings;
import Services.ManageOperations.ManageHalls;
import Services.Validator.ValidateBooking;
import Views.ManageHalls.SearchHallsView;
import Views.ManageHalls.SelectHallTableView;
import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author janith
 */
public class SearchBookingsView extends javax.swing.JPanel {

    /**
     * Creates new form AddBookingsView
     */
    
    public SearchBookingsView() {
        initComponents();
    }

    private ManageHalls mh = new ManageHalls();
    private ManageBookings mb = new ManageBookings();
    private int hallId = -1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MondayChk = new javax.swing.JCheckBox();
        TuesdayChk = new javax.swing.JCheckBox();
        WednesdayChk = new javax.swing.JCheckBox();
        FridayChk = new javax.swing.JCheckBox();
        SaturdayChk = new javax.swing.JCheckBox();
        SundayChk = new javax.swing.JCheckBox();
        ThursdayChk = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        confirmedChk = new javax.swing.JCheckBox();
        searchHalls = new javax.swing.JButton();
        hallSearchResultLabel = new javax.swing.JLabel();
        startDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        endDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        bookedByTxt = new javax.swing.JTextField();
        hallSelectedChk = new javax.swing.JCheckBox();
        bookedBySelectedChk = new javax.swing.JCheckBox();
        startDateSelectedChk = new javax.swing.JCheckBox();
        endDateSelectedChk = new javax.swing.JCheckBox();
        dowSelectedChk = new javax.swing.JCheckBox();
        confirmedSelectedChk = new javax.swing.JCheckBox();
        allDayChk = new javax.swing.JCheckBox();

        jLabel1.setText("Search Halls");

        jLabel2.setText("Currently Selected");

        jLabel3.setText("Start Date");

        jLabel4.setText("End Date");

        jLabel5.setText("Day of week");

        MondayChk.setText("Monday");
        MondayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        TuesdayChk.setText("Tuesday");
        TuesdayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        WednesdayChk.setText("Wednesday");
        WednesdayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        FridayChk.setText("Friday");
        FridayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        SaturdayChk.setText("Saturday");
        SaturdayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        SundayChk.setText("Sunday");
        SundayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        ThursdayChk.setText("Thursday");
        ThursdayChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOfWeekChkActionPerformed(evt);
            }
        });

        jLabel6.setText("Confirmed");

        confirmedChk.setText("Confirm");
        confirmedChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmedChkActionPerformed(evt);
            }
        });

        searchHalls.setText("Search Halls");
        searchHalls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHallsActionPerformed(evt);
            }
        });

        hallSearchResultLabel.setText(" ");

        startDatePicker.setText("Pick Start Date");
        startDatePicker.addDateChangeListener(new DateChangeListenerChk("START"));

        endDatePicker.setText("Pick End Date");
        endDatePicker.addDateChangeListener(new DateChangeListenerChk("END"));

        jLabel7.setText("Booked By");

        bookedByTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bookedByTxtKeyReleased(evt);
            }
        });

        hallSelectedChk.setEnabled(false);

        bookedBySelectedChk.setEnabled(false);

        startDateSelectedChk.setEnabled(false);

        endDateSelectedChk.setEnabled(false);

        dowSelectedChk.setEnabled(false);

        confirmedSelectedChk.setEnabled(false);

        allDayChk.setText("All day");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmedSelectedChk)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hallSelectedChk)
                            .addComponent(bookedBySelectedChk)
                            .addComponent(startDateSelectedChk)
                            .addComponent(endDateSelectedChk)
                            .addComponent(dowSelectedChk))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookedByTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(162, 162, 162))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchHalls)
                                        .addComponent(hallSearchResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(WednesdayChk)
                                            .addComponent(MondayChk, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TuesdayChk, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FridayChk)
                                            .addComponent(ThursdayChk)
                                            .addComponent(SaturdayChk)))
                                    .addComponent(allDayChk)
                                    .addComponent(confirmedChk))
                                .addGap(18, 18, 18)
                                .addComponent(SundayChk)
                                .addGap(92, 92, 92))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchHalls)
                    .addComponent(hallSelectedChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hallSearchResultLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(bookedByTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookedBySelectedChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startDateSelectedChk))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(endDateSelectedChk))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(MondayChk)
                            .addComponent(ThursdayChk)
                            .addComponent(SundayChk))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FridayChk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TuesdayChk))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WednesdayChk)
                            .addComponent(SaturdayChk)))
                    .addComponent(dowSelectedChk))
                .addGap(18, 18, 18)
                .addComponent(allDayChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(confirmedChk))
                    .addComponent(confirmedSelectedChk))
                .addGap(109, 109, 109))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchHallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHallsActionPerformed
        // TODO add your handling code here:
        //search for halls
        try {
            SearchHallsView shv = new SearchHallsView();
            int firstResult = JOptionPane.showConfirmDialog(this, shv, "Search halls", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (firstResult == JOptionPane.OK_OPTION) {
                ResultSet searchResultSet = shv.searchHalls();
                SelectHallTableView shtv = new SelectHallTableView(searchResultSet);
                int secondResult = JOptionPane.showConfirmDialog(this, shtv, "Select Halls", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (secondResult == JOptionPane.OK_OPTION && shtv.getSelectedHall() != -1) {

                    int hallid = shtv.getSelectedHall();
                    this.hallId = hallid;
                    ResultSet hallResult = mh.read("hallid = " + hallid);
                    String hallString = "";
                    while (hallResult.next()) {
                        hallString = "Name: " + hallResult.getString("name");
                        hallString += " Capacity: " + hallResult.getString("capacity");
                        hallString += " Price: " + hallResult.getString("price");
                    }
                    hallSearchResultLabel.setText(hallString);
                    hallSelectedChk.setSelected(true);
                }else{
                    JOptionPane.showMessageDialog(this, "No Hall Selected");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            ExceptionMessageDialog.show(this, ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_searchHallsActionPerformed

    private void bookedByTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookedByTxtKeyReleased
        // TODO add your handling code here:
        bookedBySelectedChk.setSelected(!bookedByTxt.getText().equals(""));
    }//GEN-LAST:event_bookedByTxtKeyReleased

    private void DayOfWeekChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayOfWeekChkActionPerformed
        // TODO add your handling code here:
        dowSelectedChk.setSelected(
                MondayChk.isSelected() || TuesdayChk.isSelected() || WednesdayChk.isSelected() || 
                ThursdayChk.isSelected() || FridayChk.isSelected() || SaturdayChk.isSelected() || 
                SundayChk.isSelected() || allDayChk.isSelected()
        );
    }//GEN-LAST:event_DayOfWeekChkActionPerformed

    private void confirmedChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmedChkActionPerformed
        // TODO add your handling code here:
        confirmedSelectedChk.setSelected(true);
    }//GEN-LAST:event_confirmedChkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FridayChk;
    private javax.swing.JCheckBox MondayChk;
    private javax.swing.JCheckBox SaturdayChk;
    private javax.swing.JCheckBox SundayChk;
    private javax.swing.JCheckBox ThursdayChk;
    private javax.swing.JCheckBox TuesdayChk;
    private javax.swing.JCheckBox WednesdayChk;
    private javax.swing.JCheckBox allDayChk;
    private javax.swing.JCheckBox bookedBySelectedChk;
    private javax.swing.JTextField bookedByTxt;
    private javax.swing.JCheckBox confirmedChk;
    private javax.swing.JCheckBox confirmedSelectedChk;
    private javax.swing.JCheckBox dowSelectedChk;
    private com.github.lgooddatepicker.components.DatePicker endDatePicker;
    private javax.swing.JCheckBox endDateSelectedChk;
    private javax.swing.JLabel hallSearchResultLabel;
    private javax.swing.JCheckBox hallSelectedChk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton searchHalls;
    private com.github.lgooddatepicker.components.DatePicker startDatePicker;
    private javax.swing.JCheckBox startDateSelectedChk;
    // End of variables declaration//GEN-END:variables

    public void addBooking() {
        // TODO sanity checks to see that the values are not zero
        LocalDate startDate = startDatePicker.getDate();
        LocalDate endDate = endDatePicker.getDate();
        String bitConf = getBitConf();
        if(hallId != -1){
            if(ValidateBooking.isDateConfigValid(startDate, endDate, bitConf)){
                String bookedBy = bookedByTxt.getText();
                int confirmed = confirmedChk.isSelected() == true ? 1 : 0;
                Object[] values = {hallId,bookedBy,confirmed,Converters.fromLocalDatetoString(startDate),Converters.fromLocalDatetoString(endDate),bitConf};
                mb.create(values, mb.columnNames);
                JOptionPane.showMessageDialog(null, "Booking Made successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Selected Dates do not match");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select a hall to book");
        }
    }
    public ResultSet searchBookings(){
        String criteria = "";
        if(hallSelectedChk.isSelected()){
            criteria += "hallid = "+hallId + " or ";
        }
        if(bookedBySelectedChk.isSelected()){
            criteria += "bookedby like '%"+bookedByTxt.getText()+"%' or ";
        }
        if(startDateSelectedChk.isSelected()){        
            String startDateString = startDatePicker.getDateStringOrEmptyString()+"";
            criteria += "startdate = "+startDateString+" or ";
        }
        if(endDateSelectedChk.isSelected()){
            String endDateString = endDatePicker.getDateStringOrEmptyString()+"";
            criteria += "enddate = "+endDateString +" or ";
        }
        if(dowSelectedChk.isSelected()){
            String bitc = getBitConf();
            criteria += "dayconfig = "+bitc+" or ";
        }
        if(confirmedSelectedChk.isSelected()){
            criteria += "confirmed = "+(confirmedChk.isSelected()?"1":"0")+" or ";
        }
        criteria = criteria.substring(0, criteria.length() - 3);
        //return mb.read(criteria);
        System.out.println(criteria);
        ResultSet rs = mb.read(criteria);
        return rs;
    }

    private String getBitConf() {
        if(allDayChk.isSelected()){
            return "1111111";
        }
        String conf = MondayChk.isSelected() ? "1":"0";
        conf += TuesdayChk.isSelected() ? "1":"0";
        conf += WednesdayChk.isSelected() ? "1":"0";
        conf += ThursdayChk.isSelected() ? "1":"0";
        conf += FridayChk.isSelected() ? "1":"0";
        conf += SaturdayChk.isSelected() ? "1":"0";
        conf += SundayChk.isSelected() ? "1":"0";
        System.out.println("Bit configuration"+conf);
        return conf;
    }

    private class DateChangeListenerChk implements DateChangeListener {

        private String tag;
        public DateChangeListenerChk(String tag) {
            this.tag = tag;
        }

        @Override
        public void dateChanged(DateChangeEvent dce) {
            if(this.tag.equals("START")){
                if(dce.getNewDate().toString().equals("")){
                    SearchBookingsView.this.startDateSelectedChk.setSelected(false);
                }else{
                    SearchBookingsView.this.startDateSelectedChk.setSelected(true);
                }
            }else if(this.tag.equals("END")){
                if(dce.getNewDate().toString().equals("")){
                    SearchBookingsView.this.endDateSelectedChk.setSelected(false);
                }else{
                    SearchBookingsView.this.endDateSelectedChk.setSelected(true);
                }
            }
        }
    }
    
}
