import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.NumberFormat;

public class WriteFile {
	Payee payee; 
	Purchases purchases; 
	NumberFormat numForm; 
	public WriteFile(Payee payee, Purchases purchases, NumberFormat numForm){
		this.payee = payee;
		this.purchases = purchases;
		this.numForm = numForm; 
		write();
	}
	public void write(){
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("Results.txt"), "utf-8"))) {
			writer.write("Min :"+ numForm.format(purchases.getMin())+"\n");
			writer.write("Max :"+ numForm.format(purchases.getMax())+"\n");
			writer.write("Avg :"+ numForm.format(purchases.getAvg())+"\n");
			writer.write("Most Frequent : "+ payee.getFrequent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
