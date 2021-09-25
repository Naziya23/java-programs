class MusicalInstruments{
	public String name;
	public double price;
	public String frequency;
	public String type;
	public void play(String name){
		System.out.println("Playing"+ name +"with friends");
	}
	public void getmusicInstDetails(){
		System.out.println(name+ " "+price+ " "+frequency+ " "+type);
	}
}