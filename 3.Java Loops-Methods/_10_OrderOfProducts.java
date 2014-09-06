import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
 
public class _10_OrderOfProducts {
 
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        
        ArrayList<Product> products = ReadProductsList();
        ArrayList<Order> orders = ReadOrdersList();
        
        Double totalPrice = 0.0;
        
        for (Order order : orders) {
			Product product = search(products, order.getName());
			if(product != null){
				double price = product.getPrice() * order.getQuantity();
				totalPrice += price;
			}
		}
        
        System.out.printf("%,.1f%n", totalPrice);
    }
        
    public static Product search(ArrayList<Product> list, String name) {

    	for(Product p : list) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p; 
			}
    	}
    	return null;
    }

    
    public static ArrayList<Product> ReadProductsList() throws Exception { 	
    	ArrayList<Product> products = new ArrayList<Product>();
        
        File inputFile = new File("Products.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = br.readLine()) != null) {
        	String[] productLine = line.split(" ");        	
        	String productName = productLine[0];
        	Double productPrice = new Double(productLine[1]);
        	
        	Product product = new Product(productName, productPrice);
        	products.add(product);
        }
        br.close();
        
        return products;
    }
    
    public static ArrayList<Order> ReadOrdersList() throws Exception { 	
    	ArrayList<Order> orders = new ArrayList<Order>();
        
        File inputFile = new File("Order.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = br.readLine()) != null) {
        	String[] productLine = line.split(" ");        	
        	String productName = productLine[0];
        	Double productQuantity = new Double(productLine[1]);
        	
        	Order order = new Order(productName, productQuantity);
        	orders.add(order);
        }
        br.close();
        
        return orders;
    }
}
