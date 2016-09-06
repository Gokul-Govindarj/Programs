import java.util.Scanner;

public class SeedMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int mul=a;
		while(a>0){
			mul=mul * (a%10);
			a=a/10;
		}
		System.out.println(mul);
	}

}
