import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteFile {
	Payee payee; 
	Purchases purchases; 
	public WriteFile(Payee payee, Purchases purchases){
		this.payee = payee;
		this.purchases = purchases;
		write();
	}
	public void write(){
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("Results.txt"), "utf-8"))) {
			writer.write("Min :"+ purchases.getMin()+"\n");
			writer.write("Max :"+ purchases.getMax()+"\n");
			writer.write("Avg :"+ purchases.getAvg()+"\n");
			writer.write("Most Frequent : "+ payee.getFrequent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
