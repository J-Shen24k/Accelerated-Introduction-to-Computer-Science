package labs.lab7;

public class Insertion {

	public static void sort(String[] a) {
		for (int i=1; i<a.length; i++) {
			int j = i;
			while ( j>0 && a[j-1].compareTo(a[j])>0 ) {
				String temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				j = j-1;
			}
		}
	}

	public static void main(String[] args) {
		String [] a = {"cat", "fat", "dog", "apple", "bat", "egg"};
		
		sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
