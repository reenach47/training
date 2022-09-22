package basicsprogram;

public class Multiplication {
		int mul(int a,int b) {
			 int mul=a*b;
			 return mul;
		 }
		float mul(float a,float b,float c) {
			   return a*b*c;
		}

		public static void main(String[] args) {
			Multiplication obj=new Multiplication();
			int mul=obj.mul(20, 18);
			System.out.println("the mul of two numbers=" +mul);
			System.out.println("the mul of three numbers=" +obj.mul(1.2f,1.8f,1.5f));
			}

}

