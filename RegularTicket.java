package TicketShoeManegment;

import java.time.LocalDate;

public class RegularTicket extends Ticket{
    public RegularTicket(int id, String showName, LocalDate showDate, int rowNumber, int seatNumber, Customer ticketCustomer, double ticketPrice) {
        super(id, showName, showDate, rowNumber, seatNumber, ticketCustomer, ticketPrice);
    }
}
