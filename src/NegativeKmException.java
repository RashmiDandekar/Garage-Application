public class NegativeKmException extends Exception 
{
	private String kmI;
	public NegativeKmException()
	{
		kmI= "Invalid Km";
	}
	public NegativeKmException(String kmI)
	{
		this.kmI= kmI;
	}
	public String getKmI()
	{
		return kmI;
	}
	@Override
	public String toString() {
		return "java.lang.NegativeKmException :" +kmI;
	}
	
	
	
}
