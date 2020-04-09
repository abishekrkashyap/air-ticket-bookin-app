package model;

public class Ticket {
    
    private Sector sector;
    private double discount; 
    private Price price;
    
    public Sector getSector() {
        return sector;
    }
    public void setSector(Sector sector) {
        this.sector = sector;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public Price getPrice() {
        return price;
    }
    public void setPrice(Price price) {
        this.price = price;
    }
    
    public String toString() {
    return 
    sector + ", " +
    price + ", " +
    " DISCOUNT : " +
    discount
    ;
    }
}