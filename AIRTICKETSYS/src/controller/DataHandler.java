package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import model.Campaign;
import model.Price;
import model.Sector;

public class DataHandler {
    
    public static HashMap<String, Campaign> loadFile() {
        
        HashMap<String, Campaign> campaignMap = new HashMap<String, Campaign>();
        
        //read file and load data into HashMap
        File file = new File("campaign.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                //1,tok,ny,30000,15
                String[] cells = line.split(",");
                Campaign campaign = new Campaign();
                campaign.setId(cells[0]);
                
                //Sector
                Sector sector = new Sector();
                sector.setFrom(cells[1]);
                sector.setTo(cells[2]);
                campaign.setSector(sector);
                
                //Price
                Price price = new Price();
                price.setAmount(Double.parseDouble(cells[3]));
                price.setCurrency("INR");
                
                campaign.setPrice(price);
                campaign.setDiscountPercentage(Double.parseDouble(cells[4]));
                
                
                
                campaignMap.put(cells[0], campaign); 
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return campaignMap;
    }
}