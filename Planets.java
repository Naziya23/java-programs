class Planets{
	public String planetName;
	public String alternateName;
	public int position;
	
	
	public Planets(String plNm, String alNm, int pos){
		System.out.println("object is created");
		planetName = plNm;
		alternateName = alNm;
		position = pos;
		
		
	}
	public void Rotate(){
	System.out.println("Rotate and revolve around sun");
}
  public void displayPlanetsDetails(){
	  System.out.println(planetName+ " "+alternateName+" "+position);
  }

}