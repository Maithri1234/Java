public class Arithmetic1 {
		public static void main(String args[]){
		MulDiv mv1=new MulDiv(4,2);
		mv1.mul();
		mv1.div();
		}
		}
		class MulDiv {
		int a,b;
		MulDiv(int n1, int n2)
		{
		a=n1;
		b=n2;
		}
		void mul(){
		System.out.println("product of two numbers:"+(a*b));
		}
		void div(){
		System.out.println("Division of two numbers:"+(a/b));
		}
		}

