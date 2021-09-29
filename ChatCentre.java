class ChatCentre{
	String centreName; 
	int centreId;
	String location;
	String ownerName;
	boolean isOpen;
	String items[] = new String[5];
	
	public ChatCentre(){
		
	}
	
	public ChatCentre(String centreName, String location,  String items[]){
		this.centreName = centreName;
		this.location = location;
		this.items = items;
	}
	
	public ChatCentre(int centreId, String ownerName, boolean isOpen){
		this.centreId = centreId;
		this.ownerName = ownerName;
		this.isOpen = isOpen;
	}
	public void displayChatCentre(){
		System.out.println(centreName+" "+location+" "+centreId+" "+ownerName+" "+isOpen);
	}
	public void getItems(){
		for(int i=0; i < items.length; i++){
			System.out.println(items[i]);
		}
	}
}