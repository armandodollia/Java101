
public class position {
	private Integer value;
	private String romanChar;
	
	public position(final Integer value){
		this.value = value;
	}
	
	public position(final String romanChar){
		this.romanChar = romanChar;
	}
	
	public Integer getValue(){
		return value;
	}
	
	public String getChar(){
		return romanChar;
	}

}
