class Exam{
	public String universityName;
	public int fees;
	
	public Exam(String universityName, int fees){
		System.out.println("Exam object is created");
		this. universityName = universityName;
		this. fees = fees;
	}
	public static void main(String a[]){
		Exam exam = new Exam("VTU", 1290);	
		System.out.println(exam.universityName+" "+exam.fees);
	}
	
	}