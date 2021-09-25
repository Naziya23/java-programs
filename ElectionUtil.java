class ElectionUtil{
	static String[] voting = {"modi", "age-80", "male", "3411056789"};
	public static void main(String a[]){
		System.out.println("Main method started");
		Election.eligible(voting);
		System.out.println("End of main method");
	}
}