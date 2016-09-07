import java.util.Scanner;

public class IndexSameAsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] s = str.split(" ");
		int[] arr = new int[s.length];
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.valueOf(s[i]);
			if(arr[i]==i)
				System.out.println(i);
		}
	}

}
