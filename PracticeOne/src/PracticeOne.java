import java.util.Scanner;

public class PracticeOne {

	public static void main(String[] args) {
		int math, physic, chemistry, turkish, history, music ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuzu Giriniz: ");
		math = input.nextInt();
		
		System.out.print("Fizik Notunuzu Giriniz: ");
		physic = input.nextInt();
		
		System.out.print("Kimya Notunuzu Giriniz: ");
		chemistry = input.nextInt();
		
		System.out.print("Türkçe Notunuzu Giriniz: ");
		turkish = input.nextInt();
		
		System.out.print("Tarih Notunuzu Giriniz: ");
		history = input.nextInt();
		
		System.out.print("Müzik Notunuzu Giriniz: ");
		music = input.nextInt();
		
		int total = math + physic + chemistry + turkish + history + music;
		double result = total / 6;
		System.out.println("Not Ortalamanız:  " +result);
		
		boolean result2 = result>=60 ;
		String str = result2 ? "Geçtiniz." : "Kaldınız.";
		System.out.println(str);
	}

}
