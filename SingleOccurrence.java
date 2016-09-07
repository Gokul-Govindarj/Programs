
import java.util.Scanner;

public class SingleOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] s = str.split(" ");
		int[] ip = new int[s.length];
		int temp=0;
		for(int i =0;i<ip.length;i++){
			ip[i]=Integer.valueOf(s[i]);
		}
		for(int i=0;i<ip.length;i++){
			temp=0;
			for(int j=0;j<ip.length;j++){
				if(ip[i]==ip[j] && i!=j){
					
					ip[j]=-1;
					temp=1;
				}
				if(temp==1)
					ip[i]=-1;
			}
		}
		for(int i=0;i<ip.length;i++){
			if(ip[i]!=-1)
				System.out.println(ip[i]);
		}
	}

}
