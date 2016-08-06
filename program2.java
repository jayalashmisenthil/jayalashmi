import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteDigit {

public static List splitAndGiveList(String number){
int length=number.length();
List list=new ArrayList();
for(int i=0;i<length;i++){
String newNum=number.substring(0,i)+number.substring(i+1,length);
list.add(Integer.parseInt(newNum));
}
Collections.sort(list);
return list;
}

public static void findLeast(String number,int noOfDigit){
Integer leastNo=0;
for(int i=0;i<noOfDigit;i++){
leastNo=splitAndGiveList(number).get(0);
number=leastNo.toString();
}
System.out.println(leastNo);
}
/**
* @param args
*/
public static void main(String[] args) {
findLeast("24631",3);

}

}
Reply
Fushupin NanrenJanuary 19, 2014 at 7:11 AM

what's the reasoning behind it??
Reply
UnknownJanuary 20, 2014 at 11:48 PM

A ligth solution ... just take a 10 byte array for each digit, count no of appearance. Traverse the auxiliary array and compose the output number.

public static int LeastNumberAfterDeletingDigits(int inputNo, int noOfDigitsToDelete)
{
var s = inputNo.ToString();
var digits = new byte[10];
foreach (var ch in s)
{
digits[(byte)(ch - '0')]++;
}

var output = 0;
var cnt = s.Length - noOfDigitsToDelete;
for (int i = 0; i < digits.Length; i++)
{
for (int j = 0; j < digits[i] && cnt > 0; j++)
{
cnt--;
output = output * 10 + i;
}

if (cnt == 0) break;
}

return output;
}