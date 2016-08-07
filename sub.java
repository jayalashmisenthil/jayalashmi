import java.util.Scanner;

public class sub {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a;
		int ans=1,g=0;
		System.out.println("enter the number");
		a=sc.nextLine();
		sc.close();
		int c,d;
		int h=Integer.parseInt(a);
		int r=a.length();
		for(int i=0;i<r;i++){
			char e=a.charAt(i);
			d=Character.getNumericValue(e);
			if(d==(h%10)){
				char b=a.charAt(0);
				c=Character.getNumericValue(b);
			}
			else{
			char b=a.charAt(i+1);
			c=Character.getNumericValue(b);
			}
			for(int x=0;x<c;x++)
			{   
				ans=ans*d;
				
			}
			g=g+ans;
			
			ans=1;
			}
		System.out.println(g);
		}
}
