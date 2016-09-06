import java.util.Scanner;

public class RemoveStringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char[] ch = str.toCharArray();
		for(int i =0 ;i < ch.length;i++){
			for(int j =0;j<ch.length;j++){
				if(i!=j && ch[i] == ch[j]){
					ch[j] = ' ';
				}
			}
		}
		for(int i = 0;i<ch.length;i++){
			if(ch[i]!=' ')
				System.out.print(ch[i]);
		}
			
	}

}
