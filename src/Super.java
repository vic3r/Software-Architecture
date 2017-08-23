import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Super {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many purchases did you do today?");
		int purchases= in.nextInt();
		
		Map<String, Integer> mySuper = new HashMap<>();
		LinkedList<Integer> totals = new LinkedList<>(); 
		ArrayList<String> payees = new ArrayList<>();
		ArrayList<Integer> mostVisited = new ArrayList<>();
		
		for(int i = 0; i<purchases; i++){
			System.out.println("Total of your purchase: ");
			int total = in.nextInt();
			totals.add(total);
			
			System.out.println("Name of the payee: ");
			String name = in.next();
			payees.add(name);
			String actualP = name;
			
			if(!mySuper.containsKey(actualP)){
				mySuper.put(actualP, 1);
			}else{
				int val= mySuper.get(actualP);
				mySuper.put(actualP, val+1);
				mostVisited.add(val+1);
			}
		}
		
		System.out.println("Min :"+ Collections.min(totals));
		System.out.println("Max :"+ Collections.max(totals));
		int avg = 0;
		for(Integer i: totals){
			avg += i;
		}
		System.out.println("Avg :"+avg/purchases);
		int maxVisit = Collections.max(mostVisited);
		for(String name: payees){
			Integer actualPayee = mySuper.get(name);
			if(actualPayee==maxVisit ){
				System.out.println("Frequent Payee: "+ name);
				break;
			}
		}
		
		
		
	}
}
