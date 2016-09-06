public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		int con=sc.nextInt();
		sc.close();
		String[] s = str.split(" ");
		int[] arr=new int[s.length];
		for(int i=0;i<s.length;i++){
			arr[i] =Integer.valueOf( s[i]);
		}
		for(int i=con;i<s.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i = 0;i<con;i++){
			System.out.print(arr[i]+" "); 
			
		}
	}

}
