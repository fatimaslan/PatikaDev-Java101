import java.util.Scanner;

public class PracticeFour {

	public static void main(String[] args) {
		
		int r, angle;
		double pi = 3.14, result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Daire diliminin yarıçapını giriniz: ");
		r = input.nextInt();
		System.out.print("Daire diliminin merkez açı ölçüsünü giriniz: ");
		angle = input.nextInt();
		
		result = ((pi * (r*r) * angle) / 360);
		System.out.println("Daire diliminin alanı= " +result);
	}

}
