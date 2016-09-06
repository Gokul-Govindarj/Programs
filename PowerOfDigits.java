import java.util.Scanner;

public class PowerOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		sc.close();
		int op = 0, temp = 0, mul = 1;

		int pow = ip % 10;

		while (ip > 0) {

			temp = ip % 10;
			mul = 1;
			int j = 0;
			while (j < pow) {
				mul *= temp;

				j++;
			}

			op += mul;
			ip = ip / 10;
		}

		System.out.println(op);
	}
}
