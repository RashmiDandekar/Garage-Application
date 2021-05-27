import java.time.LocalDate;

public class Bike extends Vehicle implements VehicleInfo
{
	private String feature;
	private int average;
	private String engine;
	
	public Bike()
	{
		super("Bike");
	}
	
	
	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}


	public int getAverage() {
		return average;
	}


	public void setAverage(int average) {
		this.average = average;
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public Bike(int make, String model, LocalDate DateOfOrder, String feature, int average,
			String engine) {
		super("Bike", make, model, DateOfOrder);
		this.feature = feature;
		this.average = average;
		this.engine = engine;
	}
	
	
	@Override
	public void service(int n) throws NegativeKmException 
	{
		if(n<=0)
		{
			throw new NegativeKmException();
		}
		else
		{
			if(n>500)
				System.out.println("Servicing is requried");
			else
				System.out.println("Servicing is not required");
			
		}
	}


	@Override
	public String toString() {
		return "Bike [id=" + id + ", Vehicletype=" + getVehicletype() + ", Make=" + getMake() + ", Model()="
				+ getModel() + ", DateOfOrder=" + DateOfOrder + ", DateOfDeliver=" + DateOfDeliver + ", feature=" + feature + ", average=" + average + ", engine=" + engine + "]";
	}


	@Override
	public void vehicleEngine() {
		
		
	}


	@Override
	public void enginePower() {
		System.out.println("Strong 150cc");
		
	}


	@Override
	public void tyreType() {
		System.out.println("Circular");
		
	}


	@Override
	public void colour() {
		System.out.println("Red");
		
	}

	
}
