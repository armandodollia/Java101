import java.util.ArrayList;
import java.util.List;



public class RomanConverter {

	private String roman = "";
	private Integer num = 0, romanInt = 0;
	private List<position> romanList = new ArrayList<position>();
	
	public RomanConverter(){
		roman = "";
		num = 0;
		romanInt = 0;
		}
	
	
	public void RomanToDecimal(String theRoman){
		roman = theRoman.toUpperCase();
		Integer length = roman.length()-1;

		for(int i = 0; i <= length; i++){
				if(roman.charAt(i) == 'I'){
					num = 1;
				}
				else if(roman.charAt(i) == 'V'){
					num = 5;
				}
				else if(roman.charAt(i) == 'X'){
					num = 10;
				}
				else if(roman.charAt(i) == 'L'){
					num = 50;
				}
				else if(roman.charAt(i) == 'C'){
					num = 100;
				}
				else if(roman.charAt(i) == 'D'){
					num = 500;
				}
				else if(roman.charAt(i) == 'M'){
					num = 1000;
				}

				
				position position = new position(num);
				romanList.add(position);
		}

		for(int i = 0; i < romanList.size(); i++){
			if(i == romanList.size()-1){
				romanInt += romanList.get(i).getValue();
			}
			else{
				if(romanList.get(i).getValue() >= romanList.get(i+1).getValue()){
					romanInt += romanList.get(i).getValue();
				}
				else{
					romanInt -= romanList.get(i).getValue();
				}
			}
		}


	}
	
	public Integer getNumber(){
		return romanInt;
	}
	
	public String getRoman(){
		return roman;
	}
	
}
