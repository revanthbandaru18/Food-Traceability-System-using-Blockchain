package com.mycompany.blockchain.Food_Supply_Chain;

import com.mycompany.blockchain.main;
import static com.mycompany.blockchain.main.blockchain;
import com.mycompany.blockchain.blockchain;
import java.util.Calendar;
import com.mycompany.blockchain.main;
import javax.swing.JOptionPane;

public class retail {
    
   public String data;
   public String date;
    public boolean Sales;
    public boolean Defective;
    public boolean flag;
    public String code;
    public String location;
    public Calendar time = Calendar.getInstance();
    
    public retail(){
         code = main.tag;
      checkSales();
      checkDefective();
      colour();
    }
    
        private void checkSales() {
         int reply = JOptionPane.showConfirmDialog(null, "Check For Sale Performance Issues\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Retail - Sale Performance Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Sales=true;
        }
        else {
            Sales=false;
        }
        
        if(Sales)
        {
            data = "Sales is Good and Moving; VERIFIED";
            time.add(Calendar.DATE, 5);
            date=time.getTime().toString();
            location="GUNTUR";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            data = "Sales is not Good and Not Moving; NOT VERIFIED";
            time.add(Calendar.DATE, 5);
            date=time.getTime().toString();
            location="GUNTUR";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));	
            
	}
    }
    
    private void checkDefective() {
         int reply = JOptionPane.showConfirmDialog(null, "Check For Defection Or Tamper\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Retail - Product Defective Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Defective=true;
        }
        else {
            Defective=false;
        }
        
        if(Defective)
        {
            data = "No Defective Found; VERIFIED";
            date=time.getTime().toString();
            location="GUNTUR";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            data = "Defective Product!; NOT VERIFIED";
            date=time.getTime().toString();
            location="GUNTUR";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));
            
	}
    }

    private void colour() {
        int reply = JOptionPane.showConfirmDialog(null, "Check for colour of banana(Green or yellow)\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Defective=true;
        }
        else {
            Defective=false;
        }
        if(Defective)
        {
            data = "Colour SATISFIED";
            date=time.getTime().toString();
            location = "GUNTUR";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            System. exit(0);	
	}
    }
   
   
}
