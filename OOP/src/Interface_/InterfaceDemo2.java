package OOP.src.Interface_;

interface Vehicle    
{
	void run();	
}
public class InterfaceDemo2  
{
	public static void main(String[] args) 
	{   
	   Vehicle car = new Vehicle()
	   {
		   @Override
		   public void run()
		   {
			   System.out.println("Car is Running");
		   }
	   };
	   
	   car.run();
	   
	   
	}

}