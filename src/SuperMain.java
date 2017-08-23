public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile rFile = new ReadFile();
		new WriteFile (rFile.getPayee(), rFile.getPurchases());
		
	}

}
