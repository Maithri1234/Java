class StudentConstructor {
String name;
int rno;
StudentConstructor()
{
name="mythri";
rno=15;
}
StudentConstructor(String str, int n)
{
name=str;
rno=n;
}
public static void main(String args[]){
StudentConstructor s1=new StudentConstructor();
StudentConstructor s2=new StudentConstructor("chintu", 16);
System.out.println(s1.name);
System.out.println(s1.rno);
System.out.println(s2.name);
System.out.println(s2.rno);
}
}


