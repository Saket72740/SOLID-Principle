package interface_segmented;

//	Interface Segmented Principle-> Interfaces should be such, 
//									that client should implement unnecessary functions they do not need


// before using Interface Segmented Principle
interface RestaurantEmployee{
	void washDishes();
	void serveCustomers();
	void cookFood();
}

class waiter implements RestaurantEmployee{

	@Override
	public void washDishes() {
		// not my job	
	}

	@Override
	public void serveCustomers() {
		// yes and here is my implementation
		System.out.println("Serving the customer");
	}

	@Override
	public void cookFood() {
		// not my job
	}
}

// after using Interface Segmented Principle
interface WaiterInterface{
	void serveCustomers();
	void takeOrder();
}

interface ChefInterface{
	void cookFood();
	void decideMenu();
}

class Waiter1 implements WaiterInterface {

	@Override
	public void serveCustomers() {
		System.out.println("Serving the customer");
	}

	@Override
	public void takeOrder() {
		System.out.println("Taking Orders");
	}
}

public class InterfaceSegmentedExample {

}
