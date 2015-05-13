
public class Histoire {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Humain humain = new Humain("Bacchus", "vin");
		Brigand brigand = new Brigand("Bacchus", "vin", "méchant", 3, 100, false);
		
		
		System.out.println(brigand.presentation());
		System.out.println(brigand.kidnapperDame("Neith"));
		System.out.println(brigand.emprisonner("Ares"));
	}

}
