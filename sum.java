
import java.util.*;

public class num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	int j;
	int sum=0,je=0;
	System.out.println("enter the number");
	s=sc.nextLine();
	sc.close();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		j=Character.getNumericValue(ch);
		sum=sum+j;
		je=je+sum;
	}
	System.out.println(je);
}
}