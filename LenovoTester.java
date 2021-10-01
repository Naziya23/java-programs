class LenovoTester{
	public static void main(String a[]){
	Lenovo lenovo = new Lenovo();
	lenovo.price = 30000.00;
	lenovo.processor = "AMDA";
	lenovo.storage = "4Mb";
	lenovo.modelNo = "ehgg345";
	String store = lenovo.store();
	System.out.println(store);
	 lenovo.displayDetails();
}
}