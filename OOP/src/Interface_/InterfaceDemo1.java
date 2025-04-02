package OOP.src.Interface_;

sealed interface Moveable permits Car
{
	int SPEED = 100; //public + static + final [static blank final field]
	
	void move();  //public + abstract
}
final class Car implements Moveable
{
	@Override
	public void move()
	{
	   //SPEED = 100;  [Invalid]
		System.out.println("Speed of the Car is :"+SPEED);
	}	
}

public class InterfaceDemo1 
{
	public static void main(String[] args) 
	{
       Moveable moveable = new Car();
       moveable.move();
       System.out.println("Car is running with "+Moveable.SPEED+" Speed");
	}

}