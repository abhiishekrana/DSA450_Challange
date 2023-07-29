package oops;
// Abstract class
 abstract class Car {
	public abstract void stop();
}

// Concrete class
class Honda extends Car {
	// Hiding implementation details
	@Override public void stop()
	{
		System.out.println("Honda::Stop");
		System.out.println(
			"Mechanism to stop the car using break");
	}
}

public class abstraction {
	public static void main(String args[])
	{
		Car obj
			= new Honda(); // Car object =>contents of Honda
		obj.stop(); // call the method
	}
}
