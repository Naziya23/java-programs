class ProjectUtil{
	public static void main(String a[]){
		ProjectDTO pro = new ProjectDTO();
		pro.setProjectId(564);
		pro.setProjectTitle("Industrial automation system using RaspberryPi");
		pro.setNoOfMembers(4);
		pro.setTechnology("Embeded");
		System.out.println(pro.getProjectId()+" "+pro.getProjectTitle()+" "+pro.getNoOfMembers()+" "+pro.getTechnology());
	}
}