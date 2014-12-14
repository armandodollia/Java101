
public class PyramidMake {
	
	private String pyramid="";
	private Integer extraSpace, length;
	
	public PyramidMake(Integer n){
		length = n;
		for(;n >= 0; n--){

				extraSpace = n;
				for(; extraSpace > 0; extraSpace--){
					pyramid += " ";
				}
				for(int i = length - n; i >= 0; i--){
				pyramid += " *";
				}
				pyramid += String.format(" %n");
			}
		}
	
	public String toString(){
		return pyramid;
		
	}

}
