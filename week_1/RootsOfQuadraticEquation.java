
public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		double a = 2, b = 10, c = 10;
		double root1 , root2;
		
		// calculate the discriminant (b2 - 4ac)
	    double discriminant = b * b - 4 * a * c;

	    // check if discriminant is greater than 0
	    if (discriminant > 0) {

	      // two real and distinct roots
	      root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	      root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

	      System.out.println("root1"+ root1 + " and root2 " + root2);
	    }

	    // check if discriminant is equal to 0
	    else if (discriminant == 0) {

	      // two real and equal roots
	      // discriminant is equal to 0
	      // so -b + 0 == -b
	      root1 = root2 = -b / (2 * a);
	      System.out.println("root1 =" + root1+ "root2 = " + root2 );
	    }

	    // if discriminant is less than zero
	    else {

	      // roots are complex number and distinct
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-discriminant) / (2 * a);
	      System.out.println("root1 = " + real +"+"+ imaginary+"i");
	      System.out.println("root2 = " + real +"-"+ imaginary+"i");
	    }
	}
}
