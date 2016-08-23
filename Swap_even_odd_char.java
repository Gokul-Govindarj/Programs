import java.util.Scanner;

public class Swap_even_odd_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		sc.close();
		String op="";
		for(int i=0;i<str.length()-2;i+=2){
			if(str.charAt(i+1)!=' '){
				op+=str.charAt(i+1);
				op+=str.charAt(i);
			}
		}
			if (str.length() % 2 != 0) {          
		        op+=str.charAt(str.length()-1);
		    } 
		System.out.println(op);
	}
}
