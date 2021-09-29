 class Ecommerce{
	 String appName;
	 double ratings;
	 String size;
	 public Ecommerce(){
		 
		 this("Meesho", 4.4, "14Mb");
		 System.out.println("Ecommerce object is created");
	 }
	 public Ecommerce(String appName, double ratings, String size){
		 this.appName = appName;
		 this.ratings = ratings;
		 this.size = size;
	 }
	 public void getAppDetails(){
		 System.out.println(this.appName+" "+this.ratings+" "+this.size);
	 }
	 
 }