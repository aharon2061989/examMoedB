package TicketShoeManegment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<Ticket> showTickets = new ArrayList<>();
        Show barcelonaConcertShow = new Show(1,"barcelona concert",LocalDate.of(2023,12,20),showTickets);
        Customer firstRegularCustomer = new Customer(1,"zion","zah","zion@gmail.com","eilat",CustomerType.REGULAR,0);
        Customer secondRegularCustomer = new Customer(2,"aviv","alon","@gmail.com","tel-aviv",CustomerType.REGULAR,0);
        Customer firstVipCustomer = new Customer(2,"aharon","ben shimol","aharon@gmail.com","eilat",CustomerType.VIP,100);
        Customer secondVipCustomer = new Customer(3,"ron","ben shimol","ron@gmail.com","eilat",CustomerType.VIP,100);

        RegularTicket firstRegularTicket = new RegularTicket(1,"barcelona concert", LocalDate.of(2023,12,20),15,85,firstRegularCustomer,400);
        VipTicket firstVipTicket = new VipTicket(1,"barcelona concert", LocalDate.of(2023,12,20),10,55,firstVipCustomer,600);
        VipTicket secondVipTicket = new VipTicket(2,"barcelona concert", LocalDate.of(2023,12,20),10,54,secondVipCustomer,600);

        System.out.println("first regular ticket price " + firstRegularTicket.getTicketPrice());
        System.out.println("first vip ticket price after discount " +  firstVipTicket.getTicketPrice());
        System.out.println("second vip ticket price after discount " + secondVipTicket.getTicketPrice());

        showTickets.add(firstRegularTicket);
        showTickets.add(firstVipTicket);
        showTickets.add(secondVipTicket);
        System.out.println("the total show revenue is: " + barcelonaConcertShow.calculateShowRevenue());

        PIzza pizza = new PIzza("pizza");
        firstVipCustomer.takeFoodVoucher(pizza);
        firstVipCustomer.useFoodVoucher();

    }
}