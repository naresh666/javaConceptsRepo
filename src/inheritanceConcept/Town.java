package inheritanceConcept;

public class Town extends City {
	public static void main(String[] args)  {
		Town tn=new Town();
		tn.homes(); // this method comes from city class
		tn.water(); // this method comes from city class
		tn.trees(); // this method comes from town class
		tn.roads(); // this method is overriding method..it coms from this class only it means 
		// city class method roads() overRided by town class method 

	}
	public void roads() {
		System.out.println("it comes from town---roads");
		
	}
	public void trees() {
		System.out.println("it comes from town---trees");
		
	}

}
