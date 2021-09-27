class Restuarant{
	public String restuarantName;
	public String type;
	public String location;
	public String ownerName;
	public int restuarantId;
	public Restuarant(){
		System.out.println("Resturant object is created");
	}
	public void serve(){
	System.out.println("Serve delicious food");	
	}
	public void displayRestuarantDetails(){
		System.out.println(restuarantName+" "+type+ " "+location+" "+ownerName+" "+restuarantId);
	}
}