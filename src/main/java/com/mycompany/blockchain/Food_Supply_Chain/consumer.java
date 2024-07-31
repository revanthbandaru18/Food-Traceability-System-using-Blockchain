package com.mycompany.blockchain.Food_Supply_Chain;

import com.mycompany.blockchain.main;
import static com.mycompany.blockchain.main.blockchain;
import com.mycompany.blockchain.blockchain;
import com.mycompany.blockchain.main;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class consumer {
    
  public String data;
  public String date;
  public boolean Defective;
  public boolean flag;
  public String location;
  public String code;
  public Calendar time = Calendar.getInstance();
    
  
    public consumer(){
        code = main.tag;
        colour();
        checkDefective();
    }

    private void colour() {
        int reply = JOptionPane.showConfirmDialog(null, "Check for colour of banana(Green or Yellow)\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Defective=true;
        }
        else {
            Defective=false;
        }
        if(Defective)
        {
            data = "Colour SATISFIED";
            time.add(Calendar.DATE,  6);
            date=time.getTime().toString();
            location = "Vijayawada";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            System. exit(0);	
	}
    }
    
    private void checkDefective() {
        int reply = JOptionPane.showConfirmDialog(null, "Check For Consumer Satisfaction\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Defective=true;
        }
        else {
            Defective=false;
        }
        if(Defective)
        {
            data = "Consumer SATISFIED";
            date=time.getTime().toString();
            location = "Vijayawada";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            data = "Consumer NOT SATISFIED";
            date=time.getTime().toString();
            location = "Vijayawada";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));	
            
	}
    }
   
    
}
