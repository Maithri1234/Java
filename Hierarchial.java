class SuperHero {
  String name;
 String power;
public SuperHero(String args[]) {
this.name = name;
this.power = power;
}
public void usePower() {
System.out.println(name + " uses " +power);
}
}
 
class IronMan extends SuperHero {
public IronMan(String name) {
super(name, "Advanced Techonology");
}
}
 
class SpiderMan extends SuperHero {
public SpiderMan(String name) {
super(name, "Web-slinging and spider-like attributes");
}
}
public class Hierarchial {
public static void main(String args[]) {
IronMan in  = new IronMan("IronMan");
SpiderMan sn = new  SpiderMan ("SpiderMan");
in.usePower();
sn.usePower();
}
}

