class IPL1{
	static String []iplTeams = new String[8];
	static String[] captains = new String[8];
	public static void main(String a[])
	{
		
		iplTeams[0] = "RCB";
		iplTeams[1] = "CSK";
		iplTeams[2] = "MI";
		iplTeams[3] = "KKR";
		iplTeams[4] = "K1XP";
		iplTeams[5] = "DC";
		iplTeams[6] = "SRH";
		iplTeams[7] = "RR";
		getIplTeams();
		captains[0] = "Virat Kohli";
		captains[1] = "MS.Dhoni";
		captains[2] = "Rohit sharma";
		captains[3] = "Eoin Morgan";
		captains[4] = "Rishabh Pant";
		captains[5] = "Sanju Samson";
		captains[6] = "David Warner";
		captains[7] = "KL.Rahul";
		getCaptains();
	}
	public static void getIplTeams(){
	for (int z=0; z< iplTeams.length; z++){
		System.out.println(iplTeams[z]);
	}
  }
  public static void getCaptains(){
	  for (int i=0; i< captains.length; i++){
		  System.out.println(captains[i]);
	  }
  }
}
