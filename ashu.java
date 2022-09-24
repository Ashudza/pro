public class ashu{
public static void main(String[] args){
area a=new area();
System.out.println("area of rectangle:"+a.area_rect(10,20));
System.out.println("area of triangle:"+a.area_tri(30,40));
}
}
interface rectangle
{
float area_rect(float x,float y);
}
interface triangle
{
float area_tri(float x,float y);
}
class area implements rectangle,triangle
{
public float area_rect(float x,float y)
{
return x*y;
}
public float area_tri(float x,float y)
{
return (x*y)/2;
}
}