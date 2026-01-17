package level2;

class Check{
	String text;
	
	Check(String t){
		text=t;
		
	}
	
  boolean Pallindrome(){
	  String reversed= new StringBuilder(text).reverse().toString();
	  return text.equals(reversed);
	 
	  }
       	  
  }

public class PalindromeString {
public static void main(String[] args) {
	Check c1=new Check("mahaaaa");
	c1.Pallindrome();
		if(c1.Pallindrome()==true) {
			System.out.print("It is pallindrome");

		}else {
			System.out.print("It is not pallindrome");

		}
	}
	
	
                                    
}

