class KfcUtil{
	public static void main(String a[]){
		
		String items[]= {"Sandwich","HumBueger","SoftDrinks","Fingerchips","lolypop"};
		
		KfcDTO kfc = new KfcDTO();
			kfc.setKfcId(89);
			kfc.setFullForm("Kentucky Fried Chicken");
			kfc.setFounder("Colonel Harland Sanders");
			
			kfc.setItems(items);
			System.out.println(kfc.getKfcId()+" "+kfc.getFullForm()+" "+kfc.getFounder());
		String[] items1=	kfc.getItems();
		for(int i=0; i<items1.length; i++){
			System.out.println(items1[i]);
		}
			
		    
	}
	
}