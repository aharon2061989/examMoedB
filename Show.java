package TicketShoeManegment;

import java.time.LocalDate;
import java.util.ArrayList;

public class Show {
    private int Id;
    private String shoeName;
    private LocalDate showDate;
    private ArrayList<Ticket> showTickets;

    public Show(int id, String shoeName, LocalDate showDate, ArrayList<Ticket> showTickets) {
        Id = id;
        this.shoeName = shoeName;
        this.showDate = showDate;
        this.showTickets = showTickets;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Ticket> getShowTickets() {
        return showTickets;
    }

    public void setShowTickets(ArrayList<Ticket> showTickets) {
        this.showTickets = showTickets;
    }

    public void addShowTicket(Ticket ticket){
        this.showTickets.add(ticket);
    }
    public void removeShowTicket(Ticket ticket){
        this.showTickets.remove(ticket);
    }

    public double calculateShowRevenue(){
        double totalPrice = 0;
        for (Ticket ticket : this.getShowTickets()){
            totalPrice += ticket.getTicketPrice();
        }
        return totalPrice;
    }
}
///Your system should support adding more tickets to the show tickets list
//and remove tickets from the show tickets list.
//Each show should have the ability to calculate the show revenue. Show
//revenue will be calculated by adding the prices of all the tickets in the
//tickets list.
//In addition each show should have the ability to calculate the total
//discount given. This calculation should return the amount of discount vip
//tickets given to customers and return this amount as the calculation
//result.

