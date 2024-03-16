class StaticDemo1 {
static int a=10;
static void display()
{
System.out.println("STATIC METHOD");
}
static
{
System.out.println("STATIC BLOCK");
}
}

class MainClass
{
public static void main(String arg[]){
System.out.println("MAIN METHOD");
System.out.println(StaticDemo1.a);
StaticDemo1.display();
}
}