package inheritanceConcept;

public class methodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverLoading vlg = new methodOverLoading();
		vlg.colony1();
		vlg.colony1(235.247);
		vlg.colony1(5000);
		vlg.colony1("tom");

	}

	public void colony1() {
		System.out.println("empty parameters");
	}

	public void colony1(int rent) {
		System.out.println("house rent :" + rent);

	}

	public void colony1(String name) {
		System.out.println("house owner name : " + name);

	}

	public void colony1(Double powerBill) {
		System.out.println("powe bill : " + powerBill);

	}

	public void colony1( int number,String name) {

	}
	//(important) it allows same method name but diff parameter variables
	//here method name is same but parameters variables sequence are diff..it's also allowed
	//in method overloading
	public void colony1( String name,int number) {

	}

}
