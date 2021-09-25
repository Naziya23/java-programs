class FilmIndUtil{
	public static void main(String a[]){
		FilmIndustry motionPic = new FilmIndustry();
		motionPic.industryName = "Bollywood";
		motionPic.productionHouse = "YashRaj Films, Viacom18 India";
		motionPic.owner = "Rohit Shetty";
		
		System.out.println(motionPic.industryName + " "+motionPic.productionHouse + " " +motionPic.owner);
		
		
		motionPic.industryName = "Hollywood";
		motionPic.productionHouse = "Dream Works, Sony Pictures";
		motionPic.owner = "Robert Earl";
		
		System.out.println(motionPic.industryName + " "+motionPic.productionHouse + " " +motionPic.owner);
		
		motionPic.industryName = "Sandalwood";
		motionPic.productionHouse = "Sri Vajreshwari Combines";
		motionPic.owner = "Rockline Venkatesh";
		
		System.out.println(motionPic.industryName + " "+motionPic.productionHouse + " " +motionPic.owner);
		
		motionPic.picture();
	}
}