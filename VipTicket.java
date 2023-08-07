package TicketShoeManegment;

import java.time.LocalDate;

public class VipTicket extends Ticket{
    public VipTicket(int id, String showName, LocalDate showDate, int rowNumber, int seatNumber, Customer ticketCustomer, double ticketPrice) throws Exception {
        super(id, showName, showDate, rowNumber, seatNumber, ticketCustomer, ticketPrice);
        this.setTicketPrice(calculateVipTicketPrice());
    }

    public double calculateVipTicketPrice() throws Exception{
        if(this.getTicketCustomer().getCustomerType() != CustomerType.VIP){
            throw new Exception("sorry,only vip customer can buy a vip ticket!");
        }
        double totalprice = this.getTicketPrice();
        totalprice -= this.getTicketCustomer().getCustomerDiscount();
        return totalprice;
    }
}
///● If the ticket is VIP ticket - your system should reduce the amount of
//discount this customer has from the ticket price you got in the
//constructor