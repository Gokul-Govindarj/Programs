public class NoOfTimesCharacteroccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		sc.close();
		char ch[] = ip.toCharArray();
		int[] notimes = new int[ch.length];
		char[] c = new char[ch.length];
		int j = 0, k = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				c[j] = ch[i];
				j++;
			} else if (Character.isDigit(ch[i])) {
				if (Character.isDigit(ch[i + 1])) {

					notimes[k] = ((ch[i] - 48) * 10) + (ch[i + 1] - 48);

					i++;
					k++;
				} else {
					notimes[k] = ch[i] - 48;

					k++;
				}

			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int n = 0; n < notimes[i]; n++) {
				System.out.print(c[i]);
			}
		}
	}

}
