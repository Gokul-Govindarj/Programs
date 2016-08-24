import java.util.Scanner;

public class PrimeNo_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int temp=0;
		int count=0;
		if(n<2)
			count=0;
		else if(n==2)
			count=1;
			
		else{
			count=1;
			for(int i=3;i<=n;i++){
				temp=0;
				for(int j=2;j<=i/2;j++){
					if(i%j==0){
						temp=1;
					}
				}
				if(temp==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
