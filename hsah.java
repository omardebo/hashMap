import java.util.HashMap;

public class hsah {
	public static void main (String[] args){
		
		HashMap<Integer,String> Book = new HashMap<Integer,String>();
		
		Book.put(100," Computer Science ");  
		Book.put(101, " Engineering");  
		Book.put(102, " History ");  
		Book.put(1, " Chemist "); 
		 
		System.out.println("Values : "+ Book);    
		 
		Book.remove(1);  
		
		System.out.println("New Values: "+ Book);  
		
    }
}
