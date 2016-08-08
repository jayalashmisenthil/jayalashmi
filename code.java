import java.util.Scanner;

public class puzzle {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String []a=new String[20];
	int i,j;
	for(i=0;i<20;i++){
	a[i]=sc.next();
	a[i]=a[i].toLowerCase();
	char[] ch=a[i].toCharArray();
	for(j=0;j<a[i].length();j++){
	ch[j]=a[i].charAt(j);
 if(((ch[j]>='n') && (ch[j]<='z'))&&((ch[j+1]>='a') &&(ch[j+1]<='m'))&&((ch[j+2]>='n') && (ch[j+2]<='z'))){
			System.out.println(a[i]+" is balanced");
			break;
		}
		else{
			System.out.println(a[i]+" is not balanced");
			break;
		}
		
	}
	}
	sc.close();
	}
}
