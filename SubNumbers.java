class SubNumbers{
	public static void main(String a[]){
		sub(8,4);
		sub(3,2,5);
		sub(9,4,2);
	}
	public static void sub(int a, int b){
	System.out.println(a-b);
	}
	public static void sub(int a, int b, int c){
	System.out.println(a-b-c);
	}
	public static void sub(int a, int b, int c, int d){
	System.out.println(a-b-c-d);
	}
}