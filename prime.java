package basicsprogram;

public class prime {

	public static void main(String[] args) {
		  int num = 11, flag=0;
	      if(num == 0||num == 1) {
	         System.out.println( num + " is not a prime number");
	      } 
	      else {
	         for(int i = 2; i <= num/2; i++) {
	            if(num % i == 0) {
	               System.out.println( num + " is not prime number");
	               flag = 1;
	               break;
	            }
	         }
	         if(flag == 0) {
	            System.out.println( num + " is a prime number");
	            
	            
	         }
	      }
	}


	}


