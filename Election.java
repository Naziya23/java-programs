class Election{
	public static int age = 18;
	public static void eligible(String[] voting){
		System.out.println("inside allow method");
		if (age >= 18){
			System.out.println("Have a right to vote");
			if (voting!=null){
				getVoterIdDetails(voting);
				System.out.println("Eligible to vote");
			}
			else{
				System.out.println("voter Id not found");
			}
			
		}
		else{
			System.out.println("Not eligible to vote");
		}
		System.out.println("End of eligible method");
	}
	public static void getVoterIdDetails(String[] voting){
	for (int i=0; i <voting.length; i++){
		System.out.println(voting[i]);
	}
}
}
