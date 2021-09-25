class ChocolateUtil{
	public static void main(String a[]){
		Chocolates choco = new Chocolates();
		choco.name = "DairyMilk";
		choco.brand = "cadburry";
		choco.price = 75;
		System.out.println("chocoName" +"  " +choco.name +"\n" + "Brand" + "  " +choco.brand + "\n"+ "Price"+ "  "+choco.price);
		choco.taste();
		
		
		choco.name = "KitKat";
		choco.brand = "Nestle";
		choco.price = 50;
		System.out.println("chocoName" +"  " +choco.name +"\n" + "Brand" + "  " +choco.brand + "\n"+ "Price"+ "  "+choco.price);
		choco.taste1();
		
		choco.name = "Perk";
		choco.brand = "cadburry";
		choco.price = 25;
		System.out.println("chocoName" +"  " +choco.name +"\n" + "Brand" + "  " +choco.brand + "\n"+ "Price"+ "  "+choco.price);
		choco.taste2();
		
		choco.name = "5 Star";
		choco.brand = "cadburry";
		choco.price = 15;
		System.out.println("chocoName" +"  " +choco.name +"\n" + "Brand" + "  " +choco.brand + "\n"+ "Price"+ "  "+choco.price);
		choco.taste3();
	}
}