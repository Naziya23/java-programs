public class KfcDTO{
	public KfcDTO(){
		System.out.println("KfcDTO object is created");
		
	}
	private int kfcId;
	private String fullForm;
	private String founder;
	private String[] items = new String[5]; 
	
	public int getKfcId(){
		return kfcId;
	}
	public void setKfcId(int kfcId){
		this.kfcId = kfcId;
	}
	public String getFullForm(){
		return fullForm;
	}
	public void setFullForm(String fullForm){
		this.fullForm = fullForm;
	}
	public String getFounder(){
		return founder;
	}
	public void setFounder(String founder){
		this.founder = founder;
	}
	
	public String[] getItems(){
		return items;
	}
	public void setItems(String[] items){
		this.items = items;
	}
}