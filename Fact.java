class Fact{
	public static void main(String a[])
	{
		myFactorial(3);
	}
	public static void myFactorial(int num){
		int f=1;
		
		for (int i=1; i<=num; i++){
			f = f*i;
			System.out.println(f);
		}
		int r=1;
		for (int i=1; i<=num; i++){
			r = r*i;
		}
		System.out.println(r);
		}
}