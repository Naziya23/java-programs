class Bank{
	public static String bankName = "State bank of India";
	public static int deposit = 500;
	public static void account(String a[] passBook){
		if(deposit >= 500){
			System.out.println("Deposit is paid");
			if(null!= paasBook){
				getPassBookDetails(passBook);
				System.out.println("Account is created");
				else{
					System.out.println("Do Fill the details")
				}
			}
			else{
				System.out.println("plz pay the deposit");
			}
		}
		
		}
		public static void getPassBookDetails(String[] passBook){
			for(int i=0; i < passBook.length; i++){
				System.out.println(passBook[i]);
			}
	}
}