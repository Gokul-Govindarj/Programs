import java.util.Scanner;

public class String_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		System.out.println(Integer.valueOf(str1)*Integer.valueOf(str2));
	}

}
