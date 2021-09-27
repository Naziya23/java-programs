class GasCylinder{
	public String gasName;
	public String color;
	public int price;
	public double weight;
	
	public GasCylinder(String gasName, String color, int price, double weight){
	System.out.println("GasCylinder object is created");
	this.gasName = gasName;
	this.color = color;
	this.price = price;
	this.weight = weight;
}
public static void main(String a[]){
	GasCylinder gas = new GasCylinder("Indane", "Red", 800, 400.30);
	System.out.println(gas.gasName+" "+gas.color+" "+gas.price+" "+gas.weight);
	GasCylinder gas1 = new GasCylinder("Bharat", "Green", 900, 600.20);
	System.out.println(gas1.gasName+" "+gas1.color+" "+gas1.price+" "+gas1.weight);
}
}
