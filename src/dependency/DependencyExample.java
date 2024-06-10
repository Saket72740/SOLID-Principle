package dependency;

// Dependency Inversion Principle -> Class should depend on interfaces rather than concrete classes

//without using dependency inversion
class WiredKeyboard{
	
}
class Wirelessboard{
	
}

class WiredMouse{
	
}
class WirelessMouse{
	
}
class MacBook {
	private final WiredKeyboard keyboard;
	private final WiredMouse mouse;
	
	public MacBook() {
		keyboard = new WiredKeyboard();
		mouse = new WiredMouse();
	}
}

// using dependency inversion
interface Keyboard{
	
}
class WiredKeyboard1 implements Keyboard{
	
}
class WirelessKeyboard1 implements Keyboard{
	
}

interface Mouse{
	
}
class WiredMouse1 implements Keyboard{
	
}
class WirelessMouse1 implements Keyboard{
	
}
class MacBook1 {
	
	private final Keyboard keyboard;
	private final Mouse mouse;
	
	public MacBook1(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
}

public class DependencyExample {

}
