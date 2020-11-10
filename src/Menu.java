enum Buttons{
	A("(1) Create Single Room"),B("(2) Create Family Room"),C("(3) Display Room Information"),D("(4) Display Room Prices"),E("(0) Exit");
	
	private String btn;
	
	Buttons(String s){
		btn=s;
	}
	String getBtn() {
		return btn;
	}
	
}