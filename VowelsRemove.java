import java.util.Scanner;

public class VowelsRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		sc.close();
		String srev =new StringBuffer(str).reverse().toString();
		for(int i=0;i<srev.length();i++){
			char ch=srev.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
				System.out.print(ch);
			
		}
	}

}
