
public class mainStudent {

	public static void main(String[] args) {

		Student John  = new Student();
		John.setName("John");
		
		for (int i = 0; i < Student.NUMBER_OF_LABS; i++){
			John.setLabs(i, ((i+1) * 10));
		}
		John.calculateGrade(John.getLabs());
		
		System.out.println(John);
		

	}

}
