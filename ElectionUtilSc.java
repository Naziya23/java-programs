import java.util.Scanner;
class ElectionUtilSc{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		String age = sc.next();
		String value = ElectionSc.voting(Integer.parseInt(age));
		System.out.println(value);
	}
	
}