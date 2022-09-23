import java.util.Scanner;

public class PracticeThree {

	public static void main(String[] args) {
		int a, b, c;
		double u, square;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üçgenin birinci kenar uzunluğunu giriniz: ");
		a = input.nextInt();
		System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
		b = input.nextInt();
		System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
		c = input.nextInt();
		
		u = (a+b+c) / 2 ;
		square = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		System.out.println("Üçgenin Alanı= " +square);
	}

}
