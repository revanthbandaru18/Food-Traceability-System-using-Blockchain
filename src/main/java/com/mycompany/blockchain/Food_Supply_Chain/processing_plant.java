package com.mycompany.blockchain.Food_Supply_Chain;

import com.mycompany.blockchain.main;
import static com.mycompany.blockchain.main.blockchain;
import com.mycompany.blockchain.blockchain;
import java.util.Calendar;
import com.mycompany.blockchain.main;
import javax.swing.JOptionPane;

public class processing_plant {
    
    public String data;
    public String date;
    public boolean freshness;
    public boolean flag;
    public String location;
     public String code;
    public Calendar time = Calendar.getInstance();
    
    public processing_plant(){
        code = main.tag;
        checkFreshness();
        colour();
        
    }
    
    private void checkFreshness() {
           int reply = JOptionPane.showConfirmDialog(null, "Check For Freshness & Quality\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Product Freshness Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            freshness=true;
        }
        else {
            freshness=false;
        }
        
        if(freshness)
        {
            data = "Freshness VERIFIED";
            time.add(Calendar.DATE, 1);
            date=time.getTime().toString();
            location="Bangalore";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));		
	}
        else
        {
            data = "Freshness NOT VERIFIED";
            time.add(Calendar.DATE, 1);
            date=time.getTime().toString();
            location="Bangalore";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));	
            
	}
    }

    private void colour() {
        int reply = JOptionPane.showConfirmDialog(null, "Check for colour of banana(Green or yellow)\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            freshness=true;
        }
        else {
            freshness=false;
        }
        if(freshness)
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
