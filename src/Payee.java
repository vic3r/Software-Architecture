import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Payee implements MostVisited{
	private Map<String, Integer> payees;
	
	public Payee(){
		payees = new HashMap<>();
	}
	
	public void Add(String name){
		if(!payees.containsKey(name)){
			payees.put(name, 1);
		}else{
			int val= payees.get(name);
			payees.put(name, val+1);
		}
	}
	
	@Override
	public String getFrequent() {
		// TODO Auto-generated method stub
		int max = Collections.max(payees.values());
		for(String str: payees.keySet()){
			if(payees.get(str).equals(max)){
				return str;
			}
		}
		return "";
	}

}
