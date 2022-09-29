import java.util.Scanner;
public class TaskThree {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sınır sayısını giriniz: ");
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i *= 4) {
			System.out.println("Sınır sayısına kadar 4'ün kuvvetleri: " +i);	
		}
		
		for(int i = 1; i <= n; i *= 5) {
			System.out.println("Sınır sayısına kadar 5'ün kuvvetleri: " +i);	
		}
	}

}
