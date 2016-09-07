import java.util.Scanner;

public class ArraySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		String[] s1 = str1.split(",");
		String[] s2 = str2.split(",");
		int[] a1 = new int[s1.length];
		int[] a2 = new int[s2.length];
		for (int i = 0; i < s1.length; i++) {
			a1[i] = Integer.valueOf(s1[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			a2[i] = Integer.valueOf(s2[i]);
		}
		int count = 1;
		for (int i = 0; i < a1.length; i++) {
			count=1;
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					int a=j;
					for (int k = i; k < a2.length; k++) {
						
						if(a1[k]==a2[a]){
							count++;
							a++;
						}
						
					}
				}
			}
			if(count==a2.length){
				System.out.println("A2 is a subset of a1");
				System.exit(0);
			}
				
		}
		System.out.println("A2 is not a subset of a1");
	}

}
