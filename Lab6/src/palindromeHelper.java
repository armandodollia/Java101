
public class palindromeHelper {

		String word;
		Integer number;
		private Boolean palindromeTest = true;

		
		public palindromeHelper(String word) {
			
			while(palindromeTest){
				
				for(int i = 0; i <= (word.length()-i-1)/2; i++){
						if(word.charAt(i) != word.charAt(word.length()-1-i)){
							palindromeTest = false;
						}
				}
			}
		}
		
		public Boolean getTest(){
			return palindromeTest;
		}
}
