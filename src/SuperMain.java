import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payee payee = new Payee();
		Purchases purchases = new Purchases();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		    int nLines = Integer.parseInt(br.readLine());
		    while(nLines-->0){
		    	purchases.addPurchase(Integer.parseInt(br.readLine()));
		    	payee.Add(br.readLine());
		    }
		    br.close();  
		}catch(NumberFormatException | IOException e){
	    	e.printStackTrace();
	    }
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("Results.txt"), "utf-8"))) {
			writer.write("Min :"+ purchases.getMin()+"\n");
			writer.write("Max :"+ purchases.getMax()+"\n");
			writer.write("Avg :"+ purchases.getAvg()+"\n");
			writer.write("Most Frequent :"+ payee.getFrequent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
