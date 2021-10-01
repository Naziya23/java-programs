class LicenseUtil{
	public static void main(String a[]){
		DrivingLicenseDTO lic = new DrivingLicenseDTO();
		lic.setLicenseId(786);
		lic.setName("Rehan");
		lic.setAddress("BTM Layout");
		lic.setAge(25);
		System.out.println(lic.getLicenseId()+" "+lic.getName()+" "+lic.getAddress()+" "+lic.getAge());
	}
}