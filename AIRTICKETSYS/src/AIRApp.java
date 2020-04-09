import model.Invoice;
import model.Ticket;
import controller.DataHandler;
import controller.InvoiceManager;


public class AIRApp {
    static DataHandler dataHandler = new DataHandler();
    
    /**
     * @param args
     */
    public static void main(String[] args) {
    System.out.println("\nAir India Ticket Booking \n");
        //1. Show choices to operator
        Invoice invoice = InvoiceManager.createInvoice();
        
        System.out.println("\n************** INVOICE (" + invoice.getTickets()[0].getPrice().getCurrency() + ") *******");
        System.out.println("Sectors [From -> To] ");

        for (Ticket ticket : invoice.getTickets()) {
        System.out.println(ticket);
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("TOTAL PRICE  \t" + invoice.getTotalPrice() );
        System.out.println("DISCOUNT AMOUNT\t" + invoice.getTotalDiscount());
        
        double discountedPrice = invoice.getTotalPrice() - invoice.getTotalDiscount();
        System.out.println("PRICE TO PAY\t" + discountedPrice);
        System.out.println("*************************************");
        
        System.out.println("-->THANK YOU FOR USING AIR INDIA !!!");
    }

}