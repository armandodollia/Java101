/***********************
 * Name: Armando Dollia*
 * Date: 10/07/2014	   *
 ***********************/
public class palindromeHelper {

		String word;
		Integer number;
		public Boolean palindromeTest = true;

		public Boolean palindrome(String word) {
	
				
				for(int i = 0; i <= (word.length()-i-1)/2; i++){
						if(word.charAt(i) != word.charAt(word.length()-1-i)){
							palindromeTest = false;
						}
				}
			return palindromeTest;
		}
		
		public Boolean palindrome(Integer number){
			Integer remainder = number, counter = -1;
			while(remainder != 0){
				remainder = remainder / 10;
				counter++;
			}

			for(int i = counter; i !=0; i--){
				if((int)(number/Math.pow(10, counter)) == (int) (number % 10)){
					number = (int) (number - Math.pow(10, counter) + (number % 10));
				}
				else{
					palindromeTest = false;
				}
			}
			return palindromeTest;
			
		}
	
}
