import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
	int math, physic, turkish, chemistry, music, average, number = 0, total = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuzu Giriniz: ");
		math = input.nextInt();
		
		if( 0 < math && math < 100 ) {
			total += math;
			number++;
		}
		
		
		
		System.out.print("Fizik Notunuzu Giriniz: ");
		physic = input.nextInt();
		
		if( 0 <  physic && physic < 100 ) {
			total += physic;
			number++;
		}
		
		
		System.out.print("Türkçe Notunuzu Giriniz: ");
		turkish = input.nextInt();
		
		if( 0 <  turkish && turkish < 100 ) {
			total += turkish;
			number++;
		}
		
		
		System.out.print("Kimya Notunuzu Giriniz: ");
		chemistry = input.nextInt();
		
		if( 0 <  chemistry && chemistry < 100 ) {
			total += chemistry;
			number++;
		}
		
		
		System.out.print("Müzik Notunuzu Giriniz: ");
		music = input.nextInt();
		
		if( 0 <  music && music < 100 ) {
			total += music;
			number++;
		}
		
		average = total / number;
		
		
		if(average >= 55) {
			System.out.println("Ortalamanız: " +average);
			System.out.println("Tebrikler. Geçtiniz.");
		} else {
			System.out.println("Ortalamanız: " +average);
			System.out.println("Kaldınız.");
		}
		
		
		
		
		/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

	}

}
