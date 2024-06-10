package liskov_substitution;

interface Bike {
	void turnOnEngine();
	void accelerate();
}

class MotorCycle_ implements Bike {
	
	boolean isEngineOn;
	int speed;
	
	public void turnOnEngine() {
		// turn on the engine
		isEngineOn = true;
	}
	
	public void accelerate() {
		// increase the speed
		speed = speed + 10;
	}
}

class Bicycle_ implements Bike{
	public void turnOnEngine() {
		throw new AssertionError("There is no engine");
	}
	public void accelerate() {
		// do something
	}
}

public class WithoutLiskovExample {

}
