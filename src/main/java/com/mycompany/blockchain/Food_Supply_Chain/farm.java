package com.mycompany.blockchain.Food_Supply_Chain;

import com.mycompany.blockchain.main;
import static com.mycompany.blockchain.main.blockchain;
import com.mycompany.blockchain.blockchain;
import com.mycompany.blockchain.main;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class farm {
    
    public String data;
    public String date;
    public boolean falselabelling;
    public boolean agrochemical;
    public boolean flag;
    public String location;
    public String code;
    public Calendar time = Calendar.getInstance();
    
    public farm(){
        
        code = main.tag;
        
        checkFalseLabelling();
        checkAgroChemicalResidues();
        colour();
        
    }
    
    private void checkFalseLabelling() {
        int reply = JOptionPane.showConfirmDialog(null,"Check For False Labelling \n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "False Labelling Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            falselabelling=true;
        }
        else {
            falselabelling=false;
        }
        
        if(falselabelling)
        {
            data = "No False Labeling Found; VERIFIED";
            date=time.getTime().toString();
            location="Maharashtra";
            main.blockchain.add(new blockchain(data, "0",date,location ));
        }
        else
        {
            data = "Warning! Labeling Found; NOT VERIFIED";
            date=time.getTime().toString();
            location="Maharashtra";
            main.blockchain.add(new blockchain(data, "0",date,location));		

	}
    }
    
    private void checkAgroChemicalResidues() {
        
        int reply = JOptionPane.showConfirmDialog(null, "Check For Agro Chemical Residues\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Agro Chemical Residues", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            agrochemical=true;
        }
        else {
            agrochemical=false;
        }
        
        if(agrochemical)
        {
            data = "No Agro Chemical Residues Found; VERIFIED";
            date=time.getTime().toString();
            location="Maharashtra";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            data = "Warning! Agro Chemical Residues Found; NOT VERIFIED";
            date=time.getTime().toString();
            location="Maharashtra";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));	
            
	}
    }

    private void colour() {
        int reply = JOptionPane.showConfirmDialog(null, "Check for colour of banana(Green or yellow)\n RFID Triggered: "+code+"\n  Yes - Verified \n  No - Not Verified ", "Consumer Return Check", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            falselabelling=true;
        }
        else {
            falselabelling=false;
        }
        if(falselabelling)
        {
            data = "Colour SATISFIED";
            date=time.getTime().toString();
            location = "Maharashtra";
            main.blockchain.add(new blockchain(data, blockchain.get(blockchain.size()-1).hash,date,location));		
	}
        else
        {
            System. exit(0);	
	}
    }
    
}
