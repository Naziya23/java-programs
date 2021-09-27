class ShowRoom{
	public String type;
	public String name;
	
	public String location;
	
	public ShowRoom(String type, String name, String location){
		System.out.println("ShowRoom object is created");
		this.type = type;
		this.name = name;
		this.location = location;
	}
	public void getShowRoomDetails(){
		System.out.println(type+" "+name+ " "+location);
		
	}
}