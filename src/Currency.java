import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
	Scanner in; 
	NumberFormat numForm;
	Locale locale;
	
	public Currency(){
		 in= new Scanner(System.in);
		 
		 setCurrency();
	}
	public void setCurrency(){
		System.out.println("Select one choice: \n1)Yen\n2)Dollars\n3)MXN Pesos");
		switch(in.nextInt()){
			case 1:
				setJPN();
				break;
			case 2:
				setUS();
				break;
			case 3:
				setMXN();
				break;
			default: 
				break;
		}
	}
	public void setJPN(){
		locale = new Locale("ja","JP");
		numForm = NumberFormat.getCurrencyInstance(locale);
	}
	public void setUS(){
		locale = new Locale("en","US");
		numForm = NumberFormat.getCurrencyInstance(locale);
	}
	public void setMXN(){
		numForm = NumberFormat.getCurrencyInstance();
	}
	public NumberFormat getFormat(){
		return numForm;
	}
	

}
