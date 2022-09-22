package basicsprogram;

public class Addition {
	 public int add(int a,int b) {
		 int sum=a+b;
		 return sum;
	 }
	 int add(int a,int b,int c) {
	   return a+b+c;
	 }

	public static void main(String[] args) {
		Addition obj=new Addition();
		int sum=obj.add(12, 18);
		System.out.println("the sum of two numbers=" +sum);
		System.out.println("the sum of three numbers=" +obj.add(12,18,15));

	}
}
	