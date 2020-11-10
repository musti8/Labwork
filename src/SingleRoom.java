
public class SingleRoom extends StandardRoom {
	
	int maxPerson=1;
	
	public SingleRoom(){
		
		super();
		
		
	}
	
	@Override
	public int calculatePrice(int price, int personCount) {
		
		return (price*maxPerson)-(price*maxPerson)*((maxPerson-personCount)*(20/100));
	}

}
