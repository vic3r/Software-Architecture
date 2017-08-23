import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	Payee payee; 
	Purchases purchases; 
	BufferedReader br;
	
	public ReadFile(){
		payee = new Payee();
		purchases = new Purchases();	
		read();
	}
	public void read(){
		try {
			br = new BufferedReader(new FileReader("file.txt"));
		    int nLines = Integer.parseInt(br.readLine());
		    while(nLines-->0){
		    	purchases.addPurchase(Integer.parseInt(br.readLine()));
		    	payee.Add(br.readLine());
		    }
		    br.close();  
		}catch(NumberFormatException | IOException e){
	    	e.printStackTrace();
	    }
	}
	public Purchases getPurchases(){
		return purchases;
		
	}
	public Payee getPayee(){
		return payee;
	}
	
}
