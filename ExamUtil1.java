import java.util.Scanner;
class ExamUtil1{
	static String[] hallTicket = new String[3];
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidate Name");
		String candidateName = sc.next();
		System.out.println("Enter the USN No");
		String usnNo = sc.next();
		System.out.println(Enter the subject);
		String subjectName = sc.next();
		hallTicket[0] = candidateName;
		hallTicket[1] = usnNo;
		hallTicket[2] = subjectName;
	}
	System.out.println("Start of main method");
		 Exam.allow(hallTicket);
		System.out.println("End of main method");
	
}