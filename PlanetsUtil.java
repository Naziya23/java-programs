class PlanetsUtil{
	public static void main(String a[]){
		Planets planet = new Planets("Earth", "World", 3);
		planet.displayPlanetsDetails();
		planet.Rotate();
		Planets planet1 = new Planets("Mars", "Red planet", 4);
		planet1.displayPlanetsDetails();
		planet1.Rotate();
		Planets planet2 = new Planets("Jupiter", "jove", 5);
		planet2.displayPlanetsDetails();
		planet2.Rotate();
	}
}