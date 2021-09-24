class Exam1{
	public static String universityName = "VTU";
	public static int fees = 1350;
	public static void allow(String[] hallTicket){
		System.out.println("inside allow method");
		if(hallTicket!=null){
				getHallTicket(hallTicket);
				System.out.println("Allow to write Exam");
			}
			else{
				System.out.println("NO Hallticket!!! cannot allow to write exam");
			}
		
		System.out.println("End of allow method");
}
		public static void allow(int fees){
		System.out.println("inside allow method");	
		if(fees>1000){
			System.out.println("Fees is paid show me the hall ticket");
			
		}
		else{
			System.out.println("Gube... please pay the fees");
		}
		
		
	System.out.println("End of allow method");
}
    public static void getHallTicket(String[] hallTicket){
	for(int i=0; i <hallTicket.length; i++){
		System.out.println(hallTicket[i]);
	}
}
}