class Bicycle {
void displayFeatures()
 {
System.out.println("Features:Pedals, Manual power");
}
}

class Motorbike extends Bicycle
{
void displayFeatures() {
    super.displayFeatures();
    System.out.println("Added feature by Motorbike: Engine");
}
}

class Electricbike extends Bicycle 
{
void displayFeatures()
{
super.displayFeatures();
System.out.println("New feature by Electricbike: Electric motor and batter");
}
}

class TranspMul {
public static void main(String args[]) {
Motorbike myMbike = new Motorbike();
myMbike.displayFeatures();
Electricbike myEbike =  new Electricbike();
myEbike.displayFeatures();
}
}
