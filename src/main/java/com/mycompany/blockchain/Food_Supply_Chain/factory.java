package com.mycompany.blockchain.Food_Supply_Chain;


import com.mycompany.blockchain.main;
import static com.mycompany.blockchain.main.blockchain;
import com.mycompany.blockchain.blockchain;
import java.util.Calendar;
import com.mycompany.blockchain.main;
import javax.swing.JOptionPane;

public class factory {
    
    public String data;
    public String date;
    public boolean LotProduction;
    public boolean flag;
    public String code;
    public String location;
    public Calendar time = Calendar.getInstance();
    
    public factory(){
         code = main.tag;
        checkLotProduction();
        colour();
        
    }
    
    private void checkLotProduction() {
        int reply = JOptionPane.showConfirmDialog(null, "Check For Lot Production\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Lot Production Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            LotProduction=true;
        }
        else {
            LotProduction=false;
        }
        
        if(LotProduction)
        {
            data = "Lot Production VERIFIED";
            time.add(Calendar.DATE, 2);
            date=time.getTime().toString();
            location = "Bangalore";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));		
	}
        else
        {
            data = "Lot Production NOT VERIFIED";
            time.add(Calendar.DATE, 2);
            date=time.getTime().toString();
            location = "Bangalore";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash ,date,location));	
            
	}
    }

    private void colour() {
        int reply = JOptionPane.showConfirmDialog(null, "Check for colour of banana(Green or Yellow)\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            LotProduction=true;
        }
        else {
            LotProduction=false;
        }
        if(LotProduction)
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
