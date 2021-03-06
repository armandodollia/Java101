/***********************
 * Name: Armando Dollia*
 * Date: 10/07/2014	   *
 ***********************/
public class palindromeHelper {

		String word;
		Integer number;

		//String palindrome test constructor
		public boolean palindrome(String word) {
				this.word = word;
				
				for(int i = 0; i <= (word.length()-i-1)/2; i++){
						if(word.charAt(i) != word.charAt(word.length()-1-i)){
							return false;
						}
				}
			return true;
		}
		
		//Integer palindrome test constructor
		public boolean palindrome(Integer number){
			this.number = number;
			Integer remainder = number, counter = -1;
			
			while(remainder != 0){
				remainder /= 10;
				counter++;
			}

			for(; counter >=0; counter-=2){
				if(((int)(number/Math.pow(10, counter))) == ((int) (number % 10))){
					number = (int)((number - (Math.pow(10, counter) * (number % 10)))/10);
				}
				else{
					return false;
				}
			}
			return true;
			
		}
	
}
