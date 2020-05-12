package labs.lab7;

public class Bubble {
	
	public static void sort(int[] a) {
		boolean swapped;
		do {
			swapped = false;
			for (int i=1; i<a.length; i++) {
				if (a[i-1] > a[i]) {
					int temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}

	
	public static void main(String[] args) {
		int[] a = {10, 4, 7, 3, 8, 6, 1, 2, 5, 9};
		
		sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}


}
