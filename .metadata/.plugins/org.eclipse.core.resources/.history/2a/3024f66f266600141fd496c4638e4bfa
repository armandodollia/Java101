import java.util.ArrayList;
import java.util.List;



public class RomanConverter {

	private String roman = "";
	private Integer num = 0, romanInt = 0, length = 0;
	private List<position> romanList = new ArrayList<position>();
	
	public RomanConverter(){
		roman = "";
		num = 0;
		romanInt = 0;
		}
	
	
	public void RomanToDecimal(String theRoman){
		roman = theRoman.toUpperCase();
		length = roman.length()-1;

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
	
	public void DecimanToRoman(Integer theDecimal){
		romanInt = theDecimal;
		Integer loop = romanInt, counter = 1, multiplier;
		
		
		while(loop != 0){
		loop /= 10;
		length++;
		}
		
		loop = romanInt; //reset loop storage variable for use
		while(loop > 0){
			if(loop % 10 > 0){
			position position = new position((loop % 10));
			romanList.add(position);
			
			loop = (loop-(loop % 10))/10;
			counter *= 10;
			}
			else{
				position position = new position((loop % 10));
				romanList.add(position);
				
				loop /= 10;
				counter *= 10;
			}
		}
		
		for(int i = romanList.size() - 1; i >= 0; i--){
			switch(i){
			case 3:
				multiplier = (int) romanList.get(i).getValue();
				for(int m = multiplier; m != 0; m--){
					roman += "M";
				}
				
			case 2:
				multiplier = (int) romanList.get(i).getValue();
				
				if(multiplier == 0){
					roman += "";
				}
				else if(multiplier <= 3 && multiplier > 0){
					for(; multiplier != 0; multiplier--){
						roman += "C";
					}
				}
				else if(multiplier == 4){
					roman += "CD";
				}
				else if(multiplier >= 5 && multiplier < 9){
					roman += "D";
					
					for(int m = multiplier - 5; m != 0; m--){
						roman += "C";
					}
				}
				else if(multiplier == 9){
					roman += "CM";
				}
				
			case 1:
				multiplier = (int) romanList.get(i).getValue();
				
				if(multiplier == 0){
					roman += "";
				}
				else if(multiplier <= 3 && multiplier > 0){
					for(; multiplier != 0; multiplier--){
						roman += "X";
					}
				}
				else if(multiplier == 4){
					roman += "XL";
				}
				else if(multiplier >= 5 && multiplier < 9){
					roman += "L";
					
					for(int m = multiplier - 5; m != 0; m--){
						roman += "X";
					}
				}
				else if(multiplier == 9){
					roman += "XC";
				}
				
			case 0:
				multiplier = (int) romanList.get(i).getValue();
				
				if(multiplier == 0){
					roman += "";
				}
				else if(multiplier <= 3 && multiplier > 0){
					for(; multiplier != 0; multiplier--){
						roman += "I";
					}
				}
				else if(multiplier == 4){
					roman += "IV";
				}
				else if(multiplier >= 5 && multiplier < 9){
					roman += "V";
					
					for(int m = multiplier - 5; m != 0; m--){
						roman += "I";
					}
				}
				else if(multiplier == 9){
					roman += "IX";
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
	
	public String toString(){
		return "The integer conversion of roman mumeral " + roman + " is " + romanInt + ".";
	}
	
}
