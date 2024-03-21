import java.util.*;
public class SwitchCase {
public static void main(String args[]) {
int a=4, b=2;
Scanner sc=new Scanner(System.in);
System.out.println("********");
System.out.println("**ARITHMETIC OPERATIONS****");
System.out.println("1.Add");
System.out.println("2.Sub");
System.out.println("3.Mul");
System.out.println("4.Div");
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch) {
case 1->System.out.println("addition result:"+(a+b));
case 2->System.out.println("substraction result:"+(a-b));
case 3->System.out.println("multiplication result:"+(a*b));
case 4->System.out.println("division result:"+(a/b));
default->System.out.println("enter proper option");
}
sc.close();
}
}
