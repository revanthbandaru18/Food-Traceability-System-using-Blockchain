package com.mycompany.blockchain.Food_Supply_Chain;

import com.mycompany.blockchain.main;
import static com.mycompany.blockchain.main.blockchain;
import com.mycompany.blockchain.blockchain;
import java.util.Calendar;
import com.mycompany.blockchain.main;
import javax.swing.JOptionPane;

public class warehouse {
    
    public String data;
    public String date;
    public boolean InventoryIssue;
    public boolean BestBeforeDate;
    public boolean flag;
    public String code;
    public String location;
    public Calendar time = Calendar.getInstance();
    
    public warehouse(){
         code = main.tag;
        checkInventoryIssue();
        checkBestBeforeDate();
        colour();
        
    }
    
    private void checkInventoryIssue() {
        int reply = JOptionPane.showConfirmDialog(null, "Check For Inventory Faults\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Inventory Issue Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            InventoryIssue=true;
        }
        else {
            InventoryIssue=false;
        }
        if(InventoryIssue)
        {
            data = "Inventory Issue VERIFIED";
            time.add(Calendar.DATE, 3);
            date=time.getTime().toString();
               location="Bangalore";
          
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));		
	}
        else
        {
            data = "Inventory Issue NOT VERIFIED";
            time.add(Calendar.DATE, 3);
            date=time.getTime().toString();
               location="Bangalore";
          
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));	
            
	}
    }
    
    
    private void checkBestBeforeDate() {
        int reply = JOptionPane.showConfirmDialog(null, "Check For Best Before Date\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Expiry Date Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            BestBeforeDate=true;
        }
        else {
            BestBeforeDate=false;
        }
        
        if(BestBeforeDate)
        {
            data = "Best Before Date VERIFIED";
            date=time.getTime().toString();
               location="Bangalore";
          
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));		
	}
        else
        {
            data = "Best Before Date NOT VERIFIED";
            date=time.getTime().toString();
               location="Bangalore";
          
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));	
            
	}
    }

    private void colour() {
        int reply = JOptionPane.showConfirmDialog(null, "Check for colour of banana(Green or yellow)\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            InventoryIssue=true;
        }
        else {
            InventoryIssue=false;
        }
        if(InventoryIssue)
        {
            data = "Colour SATISFIED";
            date=time.getTime().toString();
            location = "Bangalore";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            System. exit(0);	
	}
    }
   
}
