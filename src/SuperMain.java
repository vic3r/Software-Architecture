import java.util.Scanner;

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Payee payee = new Payee();
		Purchases purchases = new Purchases();
		System.out.println("How many purchases did you do today?");
		int n = in.nextInt();
		while(n-->0){
			System.out.println("Total of your purchase: ");
			purchases.addPurchase(in.nextInt());
			System.out.println("Name of the payee: ");
			payee.Add(in.next());
		}
		System.out.println("Min :"+ purchases.getMin());
		System.out.println("Max :"+ purchases.getMax());
		System.out.println("Avg :"+ purchases.getAvg());
		System.out.println("Most Frequent :"+ payee.getFrequent());
		
	}

}
