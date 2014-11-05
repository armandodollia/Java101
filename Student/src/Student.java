
public class Student {
	private String name;
	private char grade;
	private int[] labs = new int[10];
	public static final int NUMBER_OF_LABS = 10;
	
	public Student(){
		name = "";
		grade = 'N';
		for(int i = 0; i < NUMBER_OF_LABS; i++){
			labs[i] = 0;
		}
	}
	
	public void calculateGrade(int labs[]){
		int gradeSum = 0;
		int gradePct = 0;
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
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public char getGrade(){
		return grade;
	}
	
	public void setLabs(int index, int score){
		labs[index] = score;
	}
	
	public int[] getLabs(){
		return labs;
	}
	

	public String toString(){
		String details = "";
		for(int i = 0; i < NUMBER_OF_LABS; i++){
			details += " " + labs[i];
		}
		return "\n" + name + "'s grade is: " + grade + " with the following lab scores: " + details;
	}
	
}
