
public class Student {
	private String first, last;
	private char grade;
	private int gradeSum = 0, gradePct = 0;
	private int[] labs = new int[5];
	public static final int NUMBER_OF_LABS = 5;
	
	public Student(){
		first = "";
		last = "";
		grade = 'N';
		for(int i = 0; i < NUMBER_OF_LABS; i++){
			labs[i] = 0;
		}
	}
	
	public char calculateGrade(int labs[]){

		for(int i = 0; i < NUMBER_OF_LABS; i++){;
			gradeSum += labs[i];
		}
		gradePct = (gradeSum / NUMBER_OF_LABS);
		if (gradePct >= 90){
			grade = 'A';
		}
		else if (gradePct < 90 && gradePct >= 80){
			grade = 'B';
		}
		else if (gradePct < 80 && gradePct >= 70){
			grade = 'C';
		}
		else if (gradePct < 70 && gradePct >= 60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		return grade;
	}
	
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}
	
	public void setName(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	
	public void setLabs(int index, int score){
		labs[index] = score;
	}
	
	public int[] getLabs(){
		return labs;
	}
	
	public Integer getPct(){
		return gradePct;
	}
	

	public String toString(){
		String details = "";
		for(int i = 0; i < NUMBER_OF_LABS; i++){
			details += String.format("%13d", labs[i]);
			//details += " " + labs[i];
		}
		char g = calculateGrade(getLabs());
		return String.format("%13s%13s", first, last) + details + String.format("%13d%13s", getPct(), g);
	}
	
}
