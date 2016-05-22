/**
 * This class creates a pair of float numbers.
 * @author José A. Rodríguez Rivera
 *
 */
public class FLOATPair {
	private float first;
	private float second;
	
	/**
	 * Constructs a blank FLOATPair.
	 */
	public FLOATPair()
	{
		first=0;
		second=0;
	}
	
	/**
	 * Constructs a FLOATPair with the given values.
	 * @param a the first value
	 * @param b the second value
	 */
	public FLOATPair(float a, float b)
	{
		first = a;
		second = b;
	}
	
	/**
	 * Sets the first number of the FLOATPair.
	 * @param a the first value
	 */
	public void setFirst(float a)
	{
		first = a;
	}
	
	/**
	 * Sets the second number of the FLOATPair.
	 * @param b the second value
	 */
	public void setSecond(float b)
	{
		second = b;
	}
	
	/**
	 * Returns the first value of the FLOATPair.
	 * @return the first value
	 */
	public float getFirst()
	{
		return first;
	}
	
	/**
	 * Returns the second value of the FLOATPair.
	 * @return the second value
	 */
	public float getSecond()
	{
		return second;
	}

}



