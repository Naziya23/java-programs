class AmazonPrime{
	static String[] movies = {"Shershah", "DDLJ", "Conjuring", "Injurious", "Rakta charita", "Robert", "KGF2"};
	static String[] series = {"Mirzapur", "The Family man","Four more shots","Vampire Diaries","Mumbai Doari"};
	static String movie = "Dia";
	public static void main(String a[]){
		System.out.println("Main method stated");
		getMovies(movies);
		getSeries(series);
		String mov = getMovies(movie);
		System.out.println(mov);
	}
	public static void getMovies(String[] movies){
		System.out.println("Inside getMovies method ");
		for (int i=0; i< movies.length; i++){
			System.out.println(movies[i]);
				
		}
		
	}
	
	public static void getSeries(String[] series){
		System.out.println("inside getSeries method");
		for (int i=0; i< series.length; i++){
			System.out.println(series[i]);
		}
	}
	public static String getMovies(String movie){
		System.out.println("Inside getMovies method ");
		return movie;
	}
	
}