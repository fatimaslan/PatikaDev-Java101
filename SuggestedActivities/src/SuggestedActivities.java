import java.util.Scanner;

public class SuggestedActivities {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sıcaklık değeri giriniz: ");
		heat = input.nextInt();
		
		if(heat <= 5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if( 5 < heat && heat <= 15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if( 15 < heat && heat <= 25) {
			System.out.println("Piknik yapabilirsiniz.");
		} else {
			System.out.println("Yüzebilirsiniz.");
		}
			
	}

}
