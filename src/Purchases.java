import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;

public class Purchases implements Operations{
	private ArrayList<Integer> purchases;
	
	public Purchases(){
		purchases = new ArrayList<>();
	}
	
	public void addPurchase(int purchase){
		purchases.add(purchase);
	}
	
	@Override
	public int getMax() {
		// TODO Auto-generated method stub
		return Collections.max(purchases);
	}

	@Override
	public int getMin() {
		// TODO Auto-generated method stub
		return Collections.min(purchases);
	}

	@Override
	public Double getAvg() {
		// TODO Auto-generated method stub
		return purchases.stream().mapToDouble(a -> a).average().getAsDouble();
	}

}
