package open;

// Open/Closed Principle -> Open for Extension but Closed for Modification

class Marker{
	String name;
	String color;
	int year;
	int price;
	
	public Marker(String name, String color, int year, int price) {
		this.name = name;
		this.color = color;
		this.year = year;
		this.price = price;
	}
}

class Invoice{
	
	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotal() {
		int price = ((marker.price)) * this.quantity;
		return price;
	}
}

// before using open principle
class InvoiceDao{
	Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		// Save into the DB
	}
	
	public void saveToFile(String filename) {
		// Save invoice in the File with the given name
	}
}

// After using open principle
interface InvoiceDao1{
	public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao1{

	@Override
	public void save(Invoice invoice) {
		// Save to DB		
	}	
}

class FileInvoiceDao implements InvoiceDao1{

	@Override
	public void save(Invoice invoice) {
		// Save to file
	}
	
}

public class OpenExample {
	// In the above example suppose we want to save invoice to a file,
	// then instead of create new method for this.( saveToFile(String filename) ) in that object class.
	// We will use interface for this and made both things separate .
}
