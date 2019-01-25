/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author janith
 */
public class Booking {
    private LocalDate startDate;
    private LocalDate endDate;
    private String bitConf;
    private String bookedBy;
    private boolean confirmed;
    private int hallid;
    private int bookingid;

    public Booking(LocalDate startDate, LocalDate endDate, String bitConf, String bookedBy, boolean confirmed, int hallid, int bookingid) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.bitConf = bitConf;
        this.bookedBy = bookedBy;
        this.confirmed = confirmed;
        this.hallid = hallid;
        this.bookingid = bookingid;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getBitConf() {
        return bitConf;
    }

    public void setBitConf(String bitConf) {
        this.bitConf = bitConf;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public int getHallid() {
        return hallid;
    }

    public void setHallid(int hallid) {
        this.hallid = hallid;
    }

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }
    
}
