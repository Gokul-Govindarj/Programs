import java.util.Scanner;

public class SumOfPowerOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		sc.close();
		int op =1,i=0,mul=1,n=0,temp=0;
		int len = Integer.valueOf(String.valueOf(ip).length());
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
