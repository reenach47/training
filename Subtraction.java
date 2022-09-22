package basicsprogram;

public class Subtraction {
		int sub(int a,int b) {
			 int sub=a-b;
			 return sub;
		 }
		float sub(float a,float b,float c) {
			   return a-b-c;
		}

		public static void main(String[] args) {
			Subtraction obj=new Subtraction();
			int sub=obj.sub(20, 18);
			System.out.println("the sub of two numbers=" +sub);
			System.out.println("the sub of three numbers=" +obj.sub(6.2f,2.8f,1.5f));
			}

}
