/**
 * This class defines a Quadratic Equation, including a solver for these equations.
 * @author José A. Rodríguez Rivera
 *
 */
public class QuadraticEquation {
	private float a, b, c;
	
	/**
	 * Constructs a Quadratic Equation.
	 * @param a the x^2 coefficient (has to be non-zero)
	 * @param b the x coefficient
	 * @param c the constant
	 */
	public QuadraticEquation(float a, float b, float c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Returns the equation in a String format.
	 * @return the equation
	 */
	public String getEquation()
	{
		return (a + "x^2 + " + b + "x + " + c + " = 0");
	}
	
	/**
	 * Calculates the number of real solutions of a Quadratic Equation.
	 * @return the number of real solutions
	 */
	public int realSolutionsCount()
	{
		int solutions = 0;
		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		if (discriminant > 0)
			solutions = 2;
		if (discriminant == 0)
			solutions = 1;
		if (discriminant < 0)
			solutions = 0;
		return solutions;
	}
	
	/**
	 * Calculates the real solutions, and returns them in a FLOATPair type.
	 * @return the solutions to the quadratic equation
	 */
	public FLOATPair getRealSolutions()
	{
		double firstSolution, secondSolution, discriminant = Math.pow(b, 2) - 4*a*c;
		
		firstSolution = (-b + Math.sqrt(discriminant))/(2*a);
		secondSolution = (-b - Math.sqrt(discriminant))/(2*a);
		
		FLOATPair solutions = new FLOATPair((float)firstSolution, (float)secondSolution);
		return solutions;
	}
	

}
