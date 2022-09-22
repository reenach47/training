package basicsprogram;

public class ReverseString {

	public static void main(String[] args) {
		String string = "reena";        
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--)
        {    
            reversedStr = reversedStr + string.charAt(i);    
        }    
        System.out.println("Original string: " + string);      
        System.out.println("Reverse of given string: " + reversedStr);    
    }    

	}


