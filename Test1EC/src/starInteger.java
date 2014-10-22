import java.util.Scanner;


public class starInteger {

	public static void main(String[] args) {
		Integer num;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter some integers separated by spaces: ");
		while(console.hasNext()){
			for(num = console.nextInt(); num != 0; num--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
