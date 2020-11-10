import java.util.Scanner;

public class StandardRoom {
	 int id;
	 int price;
	 int personCount=1;
	
   	 Scanner myScanner = new Scanner(System.in);
	
	
	public StandardRoom(int id) {
		
		System.out.println("Please enter room ID: \n");
		id = myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println("Please enter room price: \n");
		price = myScanner.nextInt();
		myScanner.nextLine();	
		

		System.out.println("Room #"+(id)+" created!");
		
	}

	public int calculatePrice(int price, int personCount) {
		
		return price*personCount;
	}
	public void displayInfo(){
		System.out.println(" ");
		//System.out.println(" has " +personCount+" people with price total of "+calculatePrice(price,personCount)+".");
			
	}

}
 
