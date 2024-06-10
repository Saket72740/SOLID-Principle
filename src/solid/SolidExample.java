package solid;

// Solid Responsibility Principle -> A class should have only 1 reason to change

//		Invoice class can be break
//			/	\
//		   /	 \
//   InvoiceDao  InvoicePrinter
//      class		class


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
	
	public void printInvoice() {
		//print the invoice;
	}
	
	public void saveToDB() {
		//save the data into DB
	}
}

class InvoiceDao{
	Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		
	}
}

class InvoicePrinter {
	private Invoice invoice;
	
	
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void print() {
		// print the invoice
	}
}

public class SolidExample {
	
	// A class should have only 1 reason to change
	
}
