/***********************
 * Name: Armando Dollia*
 * Date: 10/07/2014	   *
 ***********************/
public class palindromeHelper {

		String word;
		Integer number;

		public boolean palindrome(String word) {
				this.word = word;
				
				for(int i = 0; i <= (word.length()-i-1)/2; i++){
						if(word.charAt(i) != word.charAt(word.length()-1-i)){
							return false;
						}
				}
			return true;
		}
		
		public boolean palindrome(Integer number){
			this.number = number;
			Integer remainder = number, counter = 0;
			
			while(remainder != 0){
				remainder = remainder / 10;
				counter++;
			}

			for(Integer i = (counter-1); i >=0; i-=2){
				if(((int)(number/Math.pow(10, i))) == ((int) (number % 10))){
					number = (int)((number - (Math.pow(10, i) * (number % 10)))/10);
				}
				else{
					return false;
				}
			}
			return true;
			
		}
	
}
