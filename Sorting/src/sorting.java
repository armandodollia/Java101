import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class sorting {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		List<luckyNumber> list = new ArrayList<luckyNumber>();
		
		Scanner inFile = new Scanner(new FileReader("People.txt"));
		PrintWriter outFile = new PrintWriter("People_Sorted.txt");
		
		while(inFile.hasNext()){
			String name = inFile.next();
			int number = inFile.nextInt();
			luckyNumber favorite = new luckyNumber(name, number);
			list.add(favorite);
		}
		
		sort(list);//calls the method sort
		for(int i = 0; i<list.size(); i++){
			outFile.println(list.get(i).getName() + " " + list.get(i).getNumber());
		}
		outFile.close();
		inFile.close();
	}

	private static void sort(List<luckyNumber> list) {
		int n = list.size();
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i=1; i<n; i++){
				if(list.get(i-1).getNumber() > list.get(i).getNumber()){
					luckyNumber x = list.get(i);
					list.set(i, list.get(i-1));
					list.set(i-1, x);
					swapped = true;
				}
			}
		}
		
	}

}
