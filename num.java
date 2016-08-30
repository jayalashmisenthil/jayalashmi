public class reversestring {
public static void main(String[] args) {
	int num,ans=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	sc.close();
	while(num!=0){
		int s=num%10;
		ans=ans*10+s;
		num=num/10;
	}
	System.out.println(ans);
}
}