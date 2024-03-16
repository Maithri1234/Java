class StringDemo1 {
public static void main(String args[]){
String str=new String("Hello");
System.out.println(str);
System.out.println(str.length());
System.out.println(str.indexOf("e"));
System.out.println(str.charAt(2));
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.compareTo("hello"));
String set=new String("  hello  ");
System.out.println(set.trim());
System.out.println(str.replace("Hello","Hi"));
}
}


