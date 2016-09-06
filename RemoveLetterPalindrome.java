import java.util.Scanner;

public class RemoveLetterPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String rev = new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else{
			char ch[] = str.toCharArray();
			for(int i =0;i<ch.length;i++){
				String s = "";
				for(int j =0;j<ch.length;j++){
					if(i!=j){
						s+=ch[j];
					}
				}
				String srev = new StringBuffer(s).reverse().toString(); 
				if(s.equals(srev)){
					System.out.println(ch[i]);
					System.exit(1);
				}
					
			}
		}
			
	}

}
