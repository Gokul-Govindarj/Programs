import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		int a = 0;
		for(int i = 0;i<n.length();i++ )
		{
			a+=Integer.valueOf(n.charAt(i));
			
		}
		String str =String.valueOf(a);
		String strrev = new StringBuffer(str).reverse().toString();
		if(str.equals(strrev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
