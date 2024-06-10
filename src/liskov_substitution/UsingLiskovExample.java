package liskov_substitution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//

class Vehicle {
	public Integer getNumberOfWheels() {
		return 2;
	}
	public Boolean hasEngine() {
		return true;
	}
}
class MotorCycle extends Vehicle{
	
}
class Car extends Vehicle{
	
	@Override
	public Integer getNumberOfWheels() {
		return 4;
	}
}
class Bicycle extends Vehicle{
	public Boolean hasEngine() {
		return null;
	}
}

class Vehicle1 {
	public Integer getNumberOfWheels() {
		return 2;
	}
}
class EngineVehicle extends Vehicle1{
	public Boolean hasEngine() {
		return true;
	}
}
class Bicycle1 extends Vehicle1{
	public Boolean hasEngine() {
		return true;
	}
}
class Car1 extends EngineVehicle {
	
}
class MotorCycle1 extends EngineVehicle{
	
}


public class UsingLiskovExample {
	private void psvm() {
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(new MotorCycle());
		vehicleList.add(new Car());
		vehicleList.add(new Bicycle());
		
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle.hasEngine());
		}
	}
}
