import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i=1,fact=1;
		sc.close();
		if(fact>0){
		while(i<=n){
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
		}
	}
}
