public class ProjectDTO{
	
	public ProjectDTO(){
		System.out.println("ProjectDTO object is created");
	}
	
	private long projectId;
	private String projectTitle;
	private int noOfMembers;
	private String technology;
	
	public long getProjectId(){
		return projectId;
	}
	public void setProjectId(long projectId){
		this.projectId = projectId;
	}
	public String getProjectTitle(){
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle){
		this.projectTitle = projectTitle;
	}
	public int getNoOfMembers(){
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers){
		this.noOfMembers = noOfMembers;
	}
	public String getTechnology(){
		return technology;
	}
	public void setTechnology(String technology){
		this.technology = technology;
	}
}