import java.util.Scanner;
public class Dhan{
public static void main(String[] args){
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str=sc.next();
StringBuffer sbr1=new StringBuffer(str);
StringBuffer sbr2=new StringBuffer("");
int i,j;
for(i=sbr1.length()-1,j=0;i>=0;i--,j++)

sbr2.insert(j,sbr1.charAt(i));

String st2=sbr2.toString().toUpperCase();
System.out.println("Uppercase is:"+sbr2);
System.out.println("reverese is:"+st2);
System.out.println("Enter the string:");
sbr2=new StringBuffer(st2);
str=sc.next();
sbr2.append(str);
System.out.println("Append string is:"+sbr2);
}
}




