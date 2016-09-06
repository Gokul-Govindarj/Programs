import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		Integer[] arr=new Integer[String.valueOf(a).length()];
		int i=0;
		while(a>0){
			arr[i]=a%10;
			a=a/10;
			i++;
		}
		Arrays.sort(arr);
		for(i=0;i<arr.length-n;i++)
			System.out.print(arr[i]);
	}

}
