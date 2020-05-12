package labs.lab4;

public class PhoneNumber_application {

	public static void main(String[] args) {
//		one default and one non_default
		PhoneNumber pn = new PhoneNumber();
		PhoneNumber pn1 = new PhoneNumber("1","123","1234568");
		System.out.println(pn.toString());
		System.out.println(pn1.toString());

	}

}
