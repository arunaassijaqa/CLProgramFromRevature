

interface Bank{
	void account();
	void loan();
}

public class Anonymous_Demo {

	public static void main(String[] args) {
		
		//can not create object of an interface
		
		Bank b=new Bank() {
			
			public void loan() {
				// TODO Auto-generated method stub
				
			}
			
			public void account() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
