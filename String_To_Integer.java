import java.util.Scanner;

public class String_To_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		sc.close();
		System.out.println(Integer.valueOf(str));
	}

}
