import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BitCountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		String[] s = str.split(" ");
		Integer[] a = new Integer[s.length];
		Integer[] b = new Integer[s.length];
		for(int i=0;i<s.length;i++){
			b[i]=Integer.valueOf(s[i]);
			a[i]=Integer.bitCount(b[i]);
		}
		Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(b,Collections.reverseOrder());
		for(int i =0;i<s.length;i++){
			for(int j=0;j<s.length;j++){
				if(a[i]==Integer.bitCount(b[j])){
					System.out.println(b[j]);
					b[j]=0;
					break;
				}
			}
		}
	}

}
