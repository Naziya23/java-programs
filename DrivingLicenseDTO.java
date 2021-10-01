public class DrivingLicenseDTO{
	public DrivingLicenseDTO(){
		System.out.println("DrivingLicenseDTO object is created");
	}
	private long licenseId;
	private String name;
	private String address;
	private int age;
	
	public long getLicenseId(){
		return licenseId;
	}
	public void setLicenseId(long licenseId){
		this.licenseId = licenseId;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}