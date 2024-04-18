class StringImp {
public static void main(String args[]) {
String str1="Hello";
String str2=new String(str1);
System.out.println("String1 is:"+str1);
System.out.println("String2 is:"+str2);
str2=str1.concat("World");
System.out.println("String1 is:"+str1);
System.out.println("modified string is:"+str2);
}
}

