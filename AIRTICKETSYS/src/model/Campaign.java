package model;

public class Campaign {
private String id;
private Sector sector;
private Price price;
private double discountPercentage;
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public Sector getSector() {
return sector;
}
public void setSector(Sector sector) {
this.sector = sector;
}
public Price getPrice() {
return price;
}
public void setPrice(Price price) {
this.price = price;
}
public double getDiscountPercentage() {
return discountPercentage;
}
public void setDiscountPercentage(double discountPercentage) {
this.discountPercentage = discountPercentage;
}

}