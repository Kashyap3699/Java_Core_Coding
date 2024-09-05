package week_2;

public class P_27_Parse_Boolean_From_String {
	
	    public static void main(String[] args) {
	        String A = "true";
	        String B = "false";

	        boolean value = Boolean.parseBoolean(A);
	        boolean value1 = Boolean.parseBoolean(B);
	        
	        System.out.println("After parsing into Boolean value of A is: " + value);
	        System.out.println("After parsing into Boolean value of B is: " + value1);

	    }
	}


