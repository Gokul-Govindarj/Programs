import java.util.*;
public class StringReverse {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		StringBuffer s=new StringBuffer(str);
		System.out.println(s.reverse().toString());
	}

}
