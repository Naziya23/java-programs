class Country2{
	static String []countryName = new String[5];
	public static void main(String a[])
	{
		
		countryName[0] = "India";
		countryName[1] = "Pakistan";
		countryName[2] = "Afghanistan";
		countryName[3] = "Andorra";
		countryName[4] = "USA";
		getCountryNames();
	}
	public static void getCountryNames(){
		
	
		for(int z=0; z< countryName.length; z++){
			System.out.println(countryName[z]);
		}
	}
}