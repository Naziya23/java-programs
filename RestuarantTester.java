class RestuarantTester{
	public static void main(String a[]){
		Restuarant rest = new Restuarant();
		rest.restuarantName = "Food Camp";
		rest.type = "veg";
		rest.location = "Rajajinagar";
		rest.ownerName = "Prakash";
		rest.restuarantId = 789;
		rest.serve();
		rest.displayRestuarantDetails();
		
		Restuarant rest1 = new Restuarant();
		rest1.restuarantName = "Empire";
		rest1.type = "Non-veg";
		rest1.location = "Karamangala";
		rest1.ownerName = "Arman";
		rest1.restuarantId = 7894;
		rest1.serve();
		rest1.displayRestuarantDetails();
		
		Restuarant rest2 = new Restuarant();
		rest2.restuarantName = "Ambika";
		rest2.type = "veg";
		rest2.location = "Hubli";
		rest2.ownerName = "Siraj";
		rest2.restuarantId = 456;
		rest2.serve();
		rest2.displayRestuarantDetails();
	}
}