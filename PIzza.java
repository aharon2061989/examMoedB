package TicketShoeManegment;

public class PIzza implements FoodVoucher{
    private String name;

    public PIzza(String name){
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("“Here is your food, enjoy!”");
    }
}
