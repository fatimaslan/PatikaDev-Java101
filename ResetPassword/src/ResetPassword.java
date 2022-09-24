import java.util.Scanner;

public class ResetPassword {

	public static void main(String[] args) {
		String userName, password, select, newPassword;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Şifre: ");
		password = input.nextLine();
		
		if(password.equals("java123")) {
			System.out.println("Giriş başarılı!");
		}
		else {
			System.out.println("Yanlış şifre girdiniz!\nŞifrenizi sıfırlamak için 1'e basınız.");
			select = input.nextLine();
			if(select.equals("1")) {
				System.out.println("Yeni şifre giriniz: ");
				newPassword = input.nextLine();
				if(newPassword.equals("java123")) {
				System.out.println("Daha önce kullanmadığınız bir şifre giriniz.");
				} else { 
					System.out.println("Şifreniz oluşturuldu.");
				}
			} else {
				System.out.println("Yanlış tuşa bastınız.");
			}
		}
	}

}
