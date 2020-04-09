package controller;

import java.util.HashMap;

import model.Campaign;
import model.Ticket;

public class TicketManager {
    
static HashMap<String, Campaign> campaignMap = null;
    
    public static double calculateDiscount(Ticket tkt, Campaign campaign) {
    //Sector
    //Price
    //Discount
        
        //local variable 
        double discount = 0;
        double amount = tkt.getPrice().getAmount();
        double perDiscount = campaign.getDiscountPercentage() / 100.0;
        discount =  amount * perDiscount;
        
        return discount;
    }
    

public static Ticket createTicket(int choice) {
      //Load the campaign file

       if (campaignMap == null) {
       campaignMap = DataHandler.loadFile();
       }
  
        Campaign campaign = campaignMap.get(String.valueOf(choice));
Ticket ticket = new Ticket();
ticket.setSector(campaign.getSector());
System.out.println("SELECTED : " + campaign.getSector());
ticket.setPrice(campaign.getPrice());
double discountAmount = TicketManager.calculateDiscount(ticket, campaign);//campaign.getPrice().getAmount() * campaign.getDiscountPercentage() / 100;
ticket.setDiscount(discountAmount);
return ticket;
}


}