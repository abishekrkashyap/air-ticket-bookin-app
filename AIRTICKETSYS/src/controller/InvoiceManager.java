package controller;

import java.util.Scanner;

import model.Invoice;
import model.Ticket;

public class InvoiceManager {
    
public static Invoice createInvoice() {
double totalPrice = 0;
double totalDiscount = 0;
Scanner scanner = new Scanner(System.in);

System.out.println("Enter number of sectors : ");
int SECTOR_COUNT = scanner.nextInt();
Ticket[] tickets = new Ticket[SECTOR_COUNT];
int ticketCount = 0;
System.out.println("\nSelect from below SECTORS \n");

System.out.println("----------------------------------------------------------------------------------");
System.out.println("1: India -> New York, 2: New York -> India, 3: India -> London, 4: London -> India");
int choice = 0;

for (int i = 0; i < SECTOR_COUNT; i++) {
System.out.println("Sector # : ");
choice = scanner.nextInt();

Ticket ticket = TicketManager.createTicket(choice);
tickets[ticketCount] = ticket;
totalPrice = totalPrice + ticket.getPrice().getAmount();
totalDiscount = totalDiscount + ticket.getDiscount();
ticketCount++;
} 
Invoice invoice = new Invoice();
invoice.setTickets(tickets);
invoice.setTotalPrice(totalPrice);
invoice.setTotalDiscount(totalDiscount);
return invoice;
}


}