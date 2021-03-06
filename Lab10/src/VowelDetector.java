
public class VowelDetector {
	private Integer vowels = 0;
	
	public VowelDetector(){
		vowels = 0;
	}

	public Integer Detector(String word){
		if(word.length() == 0){
			return vowels;
			}
		
		else{
			if(word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' ||
					word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y'){
				vowels++;
			}

			return Detector(word.substring(1));
		}
	}
}
