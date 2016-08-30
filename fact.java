public class reversestring {
public static void main(String[] args) {
	int num,ans=1;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	sc.close();
	for(int i=1;i<=num;i++){
		ans=ans*i;
	}
	System.out.println(ans);
}
}