import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class mainStudent {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new FileReader("students.txt"));
		PrintWriter writer = new PrintWriter("students_agreggate.txt");
		List<Integer> classAverage = new ArrayList<Integer>();
		Integer classSum = 0;
		
		writer.printf("%13s%13s", "First Name", "Last Name");
		for( int i = 1; i <= Student.NUMBER_OF_LABS; i++){
			writer.printf("%13s", "Lab " + i);
		}
		writer.printf("%13s%13s%n", "Average", "Grade");
		
		while(reader.hasNext()){
			//int c = 0;
			Student student = new Student();
			student.setName(reader.next(), reader.next());
			for(int i = 0; i < Student.NUMBER_OF_LABS; i++){
				student.setLabs(i, reader.nextInt());
			}
			writer.println(student);
			classAverage.add(student.getPct());
			//c++;
		}
		
		for (int i = 0; i < classAverage.size(); i++){
			classSum += classAverage.get(i);
		}
		writer.println("Class Average = " + classSum / classAverage.size());
		
		reader.close();
		writer.close();
	}

}
