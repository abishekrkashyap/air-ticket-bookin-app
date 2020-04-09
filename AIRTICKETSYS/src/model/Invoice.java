package model;

public class Invoice {
    
    private Ticket[] tickets;
    private double totalPrice;
    private double totalDiscount;
    
public Ticket[] getTickets() {
return tickets;
}
public void setTickets(Ticket[] tickets) {
this.tickets = tickets;
}
public double getTotalPrice() {
return totalPrice;
}
public void setTotalPrice(double totalPrice) {
this.totalPrice = totalPrice;
}
public double getTotalDiscount() {
return totalDiscount;
}
public void setTotalDiscount(double totalDiscount) {
this.totalDiscount = totalDiscount;
}
}