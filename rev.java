public class reversestring {
public static void main(String[] args) {
	String s;
	String ans ="" ;
	Scanner sc=new Scanner(System.in);
	s=sc.next();
	sc.close();
	int a=s.length();
	for(int i=a-1;i>=0;i--){
		char ch=s.charAt(i);
		ans=ans+ch;
	}
	System.out.println(ans);
}
}