import java.util.Scanner;

//Switch case yapısını döngüyle sürekliliğini sağladım.

public class SwitchOrnegi {
	public static void main(String[] args) {
		System.out.println("Bir sayı giriniz:");
		boolean i = true;
		
		while (i) {
			Scanner input = new Scanner(System.in);
			int gun = input.nextInt();

			switch (gun) {
			case 1:
				System.out.println("pazartesi");
				i = false;
				break;
			case 2:
				System.out.println("salı");
				i = false;

				break;
			case 3:
				System.out.println("çarşamba");
				i = false;

				break;
			case 4:
				System.out.println("Perşembe");
				i = false;

				break;
			case 5:
				System.out.println("cuma");
				i = false;

				break;
			case 6:
				System.out.println("cumartesi");
				i = false;

				break;
			case 7:
				System.out.println("pazar");
				i = false;

				break;
			default:
				System.out.println("geçerli sayı gir");
				i = true;

			}

		}
	}

}