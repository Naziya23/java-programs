class StrawberryUtil{
	public static void main(String a[]){
		Strawberry berry = new Strawberry();
		berry.price = 60;
		berry.color = "Red";
		berry.season = "Winter";
		String eat = berry.eat();
		System.out.println(eat);
		berry.getDetails();
	}
}