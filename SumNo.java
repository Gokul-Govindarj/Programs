
import java.util.Scanner;

public class SumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		int ip,output=0;
		int n = Integer.valueOf(String.valueOf(inp).length());
		ip=inp*10;
		for (int i = 0; i < n; i++) {
			ip=ip/10;
			inp=inp/10;
			while (ip > 0) {
				output+= ip % 10;
				ip = ip / 10;
			}
			ip=inp*10;
		}
		System.out.println(output);
	}

}
