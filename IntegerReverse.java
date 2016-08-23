import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		String str=String.valueOf(in);
		StringBuffer s=new StringBuffer(str);
		System.out.println(Integer.valueOf(s.reverse().toString()));
	}
}
