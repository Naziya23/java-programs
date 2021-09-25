class IccUtil{
	public static void main(String a[]){
		Icc match = new Icc();
		match.team = "India";
		match.captain = "Virat Kohli";
		match.players = 12;
		System.out.println(match.team+ " "+match.captain+ " "+match.players);
		Icc match1 = new Icc();
		match1.team = "Pakistan";
		match1.captain = "Babar Azam";
		match1.players = 12;
		System.out.println(match1.team+ " "+match1.captain+ " "+match1.players);
		
		Icc match2 = new Icc();
		match2.team = "South Africa";
		match2.captain = "Quinton de kock";
		match2.players = 12;
		System.out.println(match2.team+ " "+match2.captain+ " "+match2.players);
		
		Icc match3 = new Icc();
		match3.team = "Australia";
		match3.captain = "Aaron Finch";
		match3.players = 12;
		System.out.println(match3.team+ " "+match3.captain+ " "+match3.players);
		match.play();
	}
}