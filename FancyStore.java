class FancyStore{
	String storeName;
	String location;
	int storeId;
	String items[] = {"cosmetics", "perfumes", "jeweleries", "Toys"};
	
	public FancyStore(){
		this("Bindu", "savanur", 56);
	}
	public FancyStore(String storeName, String location, int storeId){
		this.storeName = storeName;
		this.location = location;
		this.storeId = storeId;
		this. items = items;
	}
	public void getStoreDetails(){
		System.out.println(this.storeName+" "+this.location+" "+this.storeId);
	}
	public void getItems(){
		for(int i=0; i < this.items.length; i++){
			System.out.println(this.items[i]);
		}
	}
}