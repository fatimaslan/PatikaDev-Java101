import java.util.Scanner;
public class TaskTwo {

	public static void main(String[] args) {
		int number , total = 0;
		
		Scanner scan = new Scanner(System.in);
		
        do {
            System.out.print("Bir sayı giriniz: " );
            number = scan.nextInt();
            if ((number % 2 == 0) && (number % 4 == 0)){
            	total += number;  
            }
            
        } while (number % 2 == 0);
        System.out.println("Toplam = " + total);
	}

}
