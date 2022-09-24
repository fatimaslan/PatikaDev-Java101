import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		double weight, height, bmi;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		weight = input.nextDouble();
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
		height = input.nextDouble();
		
		bmi = weight / (height * height);
		System.out.println("Vücut Kitle İndeksiniz= " +bmi);
	}

}
