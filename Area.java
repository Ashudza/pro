public class Area{
public static void main(String[] args){
outer obname=new outer();
obname.display();
outer.inner ob2=obname.new inner();
ob2.method();
}
}
class outer
{
int a=100;
class inner
{
int b=200;
void method()
{
System.out.println("the accessing the inner cls:"+a);

System.out.println(a+b);
}
}
void display()
{
inner ob1=new inner();
System.out.println("the inner cls variable:"+ob1.b);
System.out.println("the inner cls variable:"+a);
}
}



