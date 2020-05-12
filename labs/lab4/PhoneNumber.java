package labs.lab4;

public class PhoneNumber {
	
	private String countryCode;
	private String areaCode;
	private String number;

	
//	Default Constructor
	public PhoneNumber(){
		countryCode = "1";
		areaCode = "123";
		number = "1234567";
		
	}
	
//	Non-default Constructor
	public PhoneNumber(String countryCode, String areaCode, String number) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
	}
	
//	Accessors(Getters)
	public String getCountryCode() {
		return countryCode;
	}
	
	public String getAreaCode() {
		return areaCode;
	}
	
	public String getNumber() {
		return number;
	}
	
	
//	Mutators(Setters)
	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public void setareaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
//	To String method
	public String toString() {
		return countryCode+","+areaCode+","+number;
	}
	
//	Boolean
	public boolean areaCode_is_three_digit() {
		return (areaCode.length() == 3);
	}
	
	public boolean number_is_seven_digit() {
		return (number.length() == 7);
	}

}
