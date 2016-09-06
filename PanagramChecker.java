import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PanagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] s = str.split(" ");
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		List op1 = new ArrayList();
		List op2 = new ArrayList();
		for (int i = 0; i < s.length; i++) {
			char[] temp = s[i].toCharArray();
			for (int j = 0; j < temp.length; j++) {
				op1.add(temp[j]);
				op2.add(temp[j]);
			}
		}
		int count = 0;
		Iterator it1 = op1.iterator();
		while (it1.hasNext()) {
			count++;
			it1.next();
		}
		char[] org = new char[count];
		int m = 0;
		Iterator it2 = op1.iterator();
		while (it2.hasNext()) {
			org[m] = (char) it2.next();
			// System.out.print(org[m]+" ");
			m++;
		}
		if (org.length < 25) {
			System.out.println("Not a Panagram cool");
			System.exit(0);
		}

		for (int i = 0; i < org.length; i++) {

			for (int j = 0; j < org.length; j++) {

				if (i != j && org[i] == org[j]) {

					org[j] = ' ';
				}
			}
		}
		count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < org.length; j++) {
				if (org[j] == ch[i]) {
					
					count++;
				}
			}
		}
		if (count == 26)
			System.out.println("Panagram");
		else
			System.out.println("Not a panagram");
	}

}
