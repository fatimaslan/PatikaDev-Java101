import java.util.Scanner;
public class TaskOne {

	public static void main(String[] args) {
		int k, number=0, total=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir pozitif tam sayı giriniz: ");
		k = input.nextInt();
		
		if( k > 0) {
			for(int i=0; i <= k; i++) {
				if( (i % 3 == 0) && (i % 4 == 0) ) {
					total += i;
					number++;
				}
			}
			double average = total / (number - 1);
			
			System.out.println("Ortalama= " +average);
			
		} else {
			System.out.println("Lütfen bir pozitif tam sayı giriniz.");
		}
	}

}
