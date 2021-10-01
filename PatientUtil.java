 class PatientUtil{
	 public static void main(String a[]){
		 PatientDTO dto = new PatientDTO();
		 dto.setPatientId(89);
		 dto.setPatientName("Ilyana");
		 dto.setAge(30);
		 dto.setGender("Female");
		 dto.setAddress("Prakash Nagar");
		 dto.setBloodGroup("0+");
		 System.out.println(dto.getPatientId()+ " "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getGender()+"  "+dto.getAddress()+" "+dto.getBloodGroup());
	 }
 }