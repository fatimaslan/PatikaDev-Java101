import java.util.Scanner;

public class PracticeFive {

	public static void main(String[] args) {
		double pear, apple, tomato, banana, aubergine, p=2.14, a=3.67, t=1.11, b=0.95, a2=5.00, total;

		System.out.println("Lütfen meyve miktarlarını kilogram cinsinden giriniz: ");
		Scanner input = new Scanner(System.in);
		System.out.print("Armut: ");
		pear = input.nextDouble();
		System.out.print("Elma: ");
		apple = input.nextDouble();
		System.out.print("Domates: ");
		tomato = input.nextDouble();
		System.out.print("Muz: ");
		banana = input.nextDouble();
		System.out.print("Patlıcan: ");
		aubergine = input.nextDouble();
		
		total = (pear * p) + (apple * a) + (tomato * t) + (banana * b) + (aubergine * a2);
		System.out.println("Toplam tutar: " +total);
	
	}

}
