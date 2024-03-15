import java.util.*;
class mathoperation
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the values of a and  b:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("addition of two:"+(a+b));
System.out.println("substraction of two:"+(a-b));
System.out.println("multiplication of two:"+(a*b));
if (b!=0)
System.out.println("division of two:"+(a/b));
else
System.out.println("we cannot divide "+a+" by zero");
}
}





