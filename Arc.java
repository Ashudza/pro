public class Arc{
public static void main(String[] args){
outer obname=new outer();
obname.display();
outer.inner ob2=obname.new inner();
ob2.method();
}
}
class outer{
int a=200;
class inner{
int b=100;
void method()
{
System.out.println("the accessing the inner variables:");
System.out.println(a);
System.out.println(a+b);
}
}
void display()
{
inner ob1=new inner();
System.out.println("the first inner element 1:"+ob1.b);
System.out.println("the second ele 2:"+a);
}
}
public class p1{
public static void main(String[] args){
outer obname=new outer();
obname.display();
outer.inner ob2=obname.new inner();
ob2.method();
}
}
