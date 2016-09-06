public class SubStringFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		int index = 0, a = 0, b = 0, temp = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str2.charAt(j) == str1.charAt(i)) {
					a = j;
					b = i;
					index = i;
					while (a < str2.length() && b<str1.length() && str2.charAt(a) == str1.charAt(b)) {

						
						temp++;
						a++;
						b++;
						if (temp == str2.length()) {
							System.out.println(index);
							System.exit(0);
						} 
					}
				}
			}
		}
		System.out.println(-1);
	}

}
