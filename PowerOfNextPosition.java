import java.util.Scanner;

public class PowerOfNextPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		sc.close();
		int op =0,i=0,mul=1;
		int n =Integer.valueOf(String.valueOf(ip).charAt(0)-48);
		int temp=ip%10;
		
		int len = Integer.valueOf(String.valueOf(ip).length());
		while(i<n){
			
			mul*=temp;
			i++;
		}
		op+=mul;
		
		for(int j=0;j<len-1;j++){
			temp=Integer.valueOf(String.valueOf(ip).charAt(j)-48);
			n=Integer.valueOf(String.valueOf(ip).charAt(j+1)-48);
			i=0;mul=1;
			
			while(i<n){
				mul*=temp;
				i++;
			}
			op+=mul;
			
		}
		System.out.println(op);
	}

}
