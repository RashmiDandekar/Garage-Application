import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleMain 
{
	public static void main(String[] args) throws NegativeKmException, IOException
	{
		ArrayList<Vehicle> order= new ArrayList<>();
		FileOutputStream fw= new FileOutputStream("ListofOrder.txt");
		PrintWriter d= new PrintWriter(fw);
		Bike B1= new Bike(2016,"TVS",LocalDate.of(2020, 9, 10),"Best", 70,"Better");
		order.add(B1);
		order.add(new Car(2017,"Hero",LocalDate.of(2020, 11, 15),"Best", 20,"Better"));
		order.add(new Cycle(2017,"Yahama",LocalDate.of(2020, 12, 10),"Best", 10,"Better"));
		Scanner in= new Scanner(System.in);
		d.println(order.get(0));
		d.println(order.get(1));
		d.println(order.get(2));
		d.close();
		fw.close();
		
		int i=3;
		while(true)
		{
			String choice;
			System.out.println("Menu :");
			System.out.println("1. Add your Vehicle");
			System.out.println("2. Check vehicle for servicing");
			System.out.println("3. Display list of registered vehicles");
			choice= in.next();
			switch(choice)
			{
				case "1":
				{
					while(i!=0) 
					{
						FileOutputStream fw1= new FileOutputStream("ListofOrder.txt");
						PrintWriter d1= new PrintWriter(fw1);
						String typeV1;
						System.out.println("Enter your Vehicle's information");
						System.out.println("Enter Vehicle type from [Car, Bike, Cycle]");
						typeV1= in.next();
						if(typeV1.equals("Car"))
						{
							Car C=new Car();
							C.setVehicletype(typeV1);
							while(C.getMake()== 0)
							{
								System.out.println("Enter year of Car made");
								C.setMake(in.nextInt());
							}
							
							while(C.getModel()== null)
							{
								System.out.println("Enter model of car");
								C.setModel(in.next());
							}
							
							System.out.println("Enter Features of car");
							C.setFeature(in.next());
							System.out.println("Enter average of car");
							C.setAverage(in.nextInt());
							System.out.println("Enter engine of car");
							C.setEngine(in.next());
							System.out.println("Your order is confirmed");
							order.add(C);
							d1.println(order.get(i));
							System.out.println("Remember your id and see your name in the list below.");
							System.out.println(order.get(i));
							System.out.println("Thanking you!!");
						}
						
						else if(typeV1.equals("Bike"))
						{
							Bike B= new Bike();
							B.setVehicletype(typeV1);
							while(B.getMake()== 0)
							{
								System.out.println("Enter year of Bike made");
								B.setMake(in.nextInt());
							}
							
							while(B.getModel()== null)
							{
								System.out.println("Enter model of Bike");
								B.setModel(in.next());
							}
							
							System.out.println("Enter Features of Bike");
							B.setFeature(in.next());
							System.out.println("Enter average of Bike");
							B.setAverage(in.nextInt());
							System.out.println("Enter engine of Bike");
							B.setEngine(in.next());
							System.out.println("Your order is confirmed");
							order.add(B);
							d1.println(order.get(i));
							System.out.println("Remember your id and see your name in the list below.");
							System.out.println(order.get(i));
							System.out.println("Thanking you!!");
						}
						else if(typeV1.equals("Cycle"))
						{
							Cycle Y= new Cycle();
							Y.setVehicletype(typeV1);
							while(Y.getMake()== 0)
							{
								System.out.println("Enter year of Cycle made");
								Y.setMake(in.nextInt());
							}
							
							while(Y.getModel()== null)
							{
								System.out.println("Enter model of Cycle");
								Y.setModel(in.next());
							}
							
							System.out.println("Enter Features of Cycle");
							Y.setFeature(in.next());
							System.out.println("Enter average of Cycle");
							Y.setAverage(in.nextInt());
							System.out.println("Enter engine of Cycle");
							Y.setEngine(in.next());
							System.out.println("Your order is confirmed");
							order.add(Y);
							d1.println(order.get(i));
							System.out.println("Remember your id and see your name in the list below.");
							System.out.println(order.get(i));
							System.out.println("Thanking you!!");
						}
						
						i++;
						d1.close();
						fw1.close();
						break;
					}
					break;
				}
				case "2":
				{
					String t;
					System.out.println("Enter your vehicle type from [Car, Bike, Cycle]");
					t= in.next();
					if(t.equals("Car"))
					{
						System.out.println("How many Kms your Car ran after previous servicing?");
						int km= in.nextInt();
						Car c= new Car();
						try
						{
							c.service(km);
						}
						catch(NegativeKmException e)
						{
							System.out.println(e);
						}
						c= null;
					}
					else if(t.equals("Bike"))
					{
						System.out.println("How many Kms your Bike ran after previous servicing?");
						int km= in.nextInt();
						Bike c= new Bike();
						try
						{
							c.service(km);
						}
						catch(NegativeKmException e)
						{
							System.out.println(e);
						}
						c= null;
					}
					else if(t.equals("Cycle"))
					{
						System.out.println("How many Kms your Cycle ran after previous servicing?");
						int km= in.nextInt();
						Cycle c= new Cycle();
						try
						{
							c.service(km);
						}
						catch(NegativeKmException e)
						{
							System.out.println(e);
						}
						c= null;
					}
					else
					{
						System.out.println("Invalid Vehicle");
					}
					break;
				}
				case "3":
				{
					FileReader fr= new FileReader("ListofOrder.txt");
					int f;
					while((f=fr.read())!= -1)
					{
						System.out.print((char)f);
					}
					System.out.println();
					break;
				}
				default:
				{
					System.out.println("Invalid input, Try again...");
					break;
				}
			}
		
		}
	}

}
