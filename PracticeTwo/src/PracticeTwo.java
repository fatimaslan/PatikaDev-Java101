import java.util.Scanner;

public class PracticeTwo {

	public static void main(String[] args) {
		double value, amount, total, rate1=0.08, rate2=0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ücret tutarını giriniz: ");
		value = input.nextDouble();
		
		System.out.println("KDVsiz Fiyat:" +value);
		
		if(value<1000) {
			amount = value * rate2;
			total = value + amount;
			
			System.out.println("KDV Oranı:" +rate2);
			
		}else {
			amount = value * rate1;
			total = value + amount;
			System.out.println("KDV Oranı:" +rate1);
		}
		
		System.out.println("KDV Miktarı:" +amount);
		System.out.println("KDVli Fiyat:" +total);
	}

}
