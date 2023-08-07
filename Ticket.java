package TicketShoeManegment;

import java.time.LocalDate;

public abstract class Ticket {
    private int Id;
    private String showName;
    private LocalDate showDate;
    private int rowNumber;
    private int seatNumber;
    private Customer ticketCustomer;
    private double ticketPrice;


    public Ticket(int id, String showName, LocalDate showDate, int rowNumber, int seatNumber, Customer ticketCustomer, double ticketPrice) {
        Id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.ticketCustomer = ticketCustomer;
        this.ticketPrice = ticketPrice;
    }

    public int getId() {
        return Id;
    }

    public String getShowName() {
        return showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Customer getTicketCustomer() {
        return ticketCustomer;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTicketCustomer(Customer ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }
}