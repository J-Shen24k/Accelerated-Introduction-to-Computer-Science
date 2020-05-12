package labs.lab3;
import java.util.Scanner;
public class lab303 {
	
	
public static void main(String args[]) {
//	create an array equal to the question 3
	Scanner input = new Scanner(System.in);
	int[]a= {72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116, 104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109, 98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 32, 62421};
    int smallest = a[0];
	
//    start to compare numbers and keep the smaller one between each two
    for(int i=0;i<a.length;i++) {
		if(smallest > a[i]) {
			smallest = a[i];
		}
	}
	
	
	System.out.println(smallest);
	input.close();
}
}
