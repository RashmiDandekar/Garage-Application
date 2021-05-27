import java.time.LocalDate;
import java.util.regex.Pattern;

public abstract class Vehicle implements VehicleInfo
{
	 public int id;
	 private String vehicletype;
	 private int make;
	 private String model;
	 public LocalDate DateOfOrder;
	 public LocalDate DateOfDeliver;
	 private static int c=1;
	 
	 public Vehicle(String vehicletype)
	 {
		 this.vehicletype= vehicletype;
		 this.DateOfOrder= LocalDate.now();
		 this.DateOfDeliver= DateOfOrder.plusDays(15);
		 this.id=c++;
	 } 
	public Vehicle(String vehicletype, int make, String model, LocalDate DateOfOrder) {
		this.id= c++;
		
		boolean b=Pattern.matches("[a-z,A-Z]{1,20}", vehicletype);
		if(b) 
			this.vehicletype = vehicletype;
		else
			System.out.println("Invalid input, please enter atmost 20 chars");
		
		if(make>2015 && make<=2099)
			this.make = make;
		else
			System.out.println("Invalid input, please enter greater than 2015");
		

		if(model.equals("Hero") || model.equals("Yahama") || model.equals("TVS"))
			this.model = model;
		else
			System.out.println("Invalid input, enter from [Hero,Yahama,TVS]");
		
		this.DateOfOrder = DateOfOrder;
		this.DateOfDeliver= DateOfOrder.plusDays(15);
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) 
	{
		boolean b=Pattern.matches("[a-z,A-Z]{1,20}", vehicletype);
		if(b) 
			this.vehicletype = vehicletype;
		else
			System.out.println("Invalid input, please enter atmost 20 chars");
	}

	public int getMake() {
		return make;
	}

	public int setMake(int make) 
	{
		if(make>2015 && make<=2099)
			this.make = make;
		else
			System.out.println("Invalid input, please enter greater than 2015");
		return 0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model.equals("Hero") || model.equals("Yahama") || model.equals("TVS"))
			this.model = model;
		else
			System.out.println("Invalid input, enter from [Hero,Yahama,TVS]");
	}
	
	public void vehicleModel(Object Vehicle)
	{
		if(Vehicle instanceof Car)
		{
			System.out.println("Vehicle Type : "+vehicletype);
		}
		else if(Vehicle instanceof Bike)
		{
			System.out.println("Vehicle Type : "+vehicletype);
		}
		else if(Vehicle instanceof Cycle)
		{
			System.out.println("Vehicle Type : "+vehicletype);
		}
		else
		{
			{
				System.out.println("Vehicle Type : Default");
			}
		}
	}
	
	public abstract void service(int n) throws NegativeKmException;
	
	public abstract void vehicleEngine();
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicletype=" + vehicletype + ", make=" + make + ", model=" + model
				+ ", DateOfOrder=" + DateOfOrder + ", DateOfDeliver=" + DateOfDeliver + "]";
	}


	 
	
	 
}
