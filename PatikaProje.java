import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı Giriniz : ");
		int num = input.nextInt();
		if (isAsal(num)) {
			System.out.println(num + " sayısı ASALDIR !");
		}
		else System.out.println(num + " sayısı ASAL değildir !");
	}

	private static boolean isAsal(int num) {
		if (num < 2) return false;
		return isAsal(num, 2);
	}

	private static boolean isAsal(int num, int i) {
		if (i == ((int)Math.sqrt(num)) + 1)  return true;
		if (num % i == 0) return false;
		return isAsal(num, i + 1);
	}

}
