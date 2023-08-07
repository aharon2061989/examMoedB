package TicketShoeManegment;

public class Customer {
    private int Id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private double customerDiscount;
    private FoodVoucher foodVoucher;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, double customerDiscount) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public double getCustomerDiscount() {
        return customerDiscount;
    }

    public void takeFoodVoucher(FoodVoucher foodVoucher){
        this.foodVoucher = foodVoucher;
        System.out.println("food voucher accepted!");
    }

    public void useFoodVoucher() {
        if (this.foodVoucher != null){
            this.foodVoucher.eat();
        }
        else{
            System.out.println("sorry, you don't have a voucher!");
        }

    }

}
