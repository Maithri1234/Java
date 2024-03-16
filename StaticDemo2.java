class StaticDemo2 {
static int a=10;
static void display()
{
System.out.println("STATIC METHOD");
}
static
{
System.out.println("STATIC BLOCK");
}
public static void main(String args[]){
System.out.println("MAIN METHOD");
System.out.println(a);
display();
}
}