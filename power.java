
package high;

import java.util.Scanner;


public class High {

    public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
  int m=s.length();
        System.out.println(m);
             int g,n,k;
             int j=0;
    for(int i=0;i<m;i++)
    {
    g=s.charAt(i)-'0';
           n=s.charAt(m-1)-'0';  
             k=pow2(g,n);
                    j=j+k;
                     System.out.println(j);
  }
    
  }
   static  int pow2(int g,int n){
      int total=1;
      for(int i=1;i<=n;i++){
          total*=g;
      
      }
      
   return total;
    
  }  
