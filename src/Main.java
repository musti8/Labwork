import java.util.Scanner;

public class Main {



	public static void main(String args[]) {

		StandardRoom[] Room = new StandardRoom [1000];
		
		Scanner myScanner = new Scanner(System.in);
		int choice;	
	
		 int roomIndex=1;
		 
		
		while(true) {
			
			for(Buttons b : Buttons.values()) {
				
				System.out.println(" \n"+b.getBtn());
				
			}
			
			choice = myScanner.nextInt();
			myScanner.nextLine();

			if(choice == 0) {
				myScanner.close();
				break;
			}

			else if(choice == 2) {

				Room[] = new StandardRoom(id);
				
			}
			else if(choice == 3) {
				for(StandardRoom a : Room) {
					if(a!=null){
						System.out.print("Room #"+(a.num_room));
						a.displayInfo();	
					}
					
				}
			}



			else if(choice == 4) {
				System.out.printf(" %d Rooms are created so far\n",roomIndex-1);
			}
		}

	}

}
