class Arithmetic {
public static void main(String args[]){
AddSub as1=new AddSub(4,2);
as1.add();
as1.sub();
}
}
class AddSub {
int a,b;
AddSub(int n1, int n2)
{
a=n1;
b=n2;
}
void add() {
System.out.println("Addition of two number:"+(a+b));
void sub {
System.out.println("Substraction of two number:"+(a-b));
}
}


