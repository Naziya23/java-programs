class MusicInstUtil{
	public static void main(String a[]){
		MusicalInstruments music = new MusicalInstruments();
		music.name = "Guitar";
		music.price = 3000.20;
		music.frequency = "30Hz";
		music.type = "Western";
		music.getmusicInstDetails();
		
		music.play(music.name);
		music.name = "Violin";
		music.price = 2000.20;
		music.frequency = "20Hz";
		music.type = "Western";
		music.getmusicInstDetails();
		music.play(music.name);
	}
}