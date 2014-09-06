import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
 
public class _09_ListOfProducts {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.ROOT);
        ArrayList<Product> products = new ArrayList<Product>();
        
        File inputFile = new File("Input.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = br.readLine()) != null) {
        	String[] productLine = line.split(" ");
        	Double productPrice = new Double(productLine[1]);
        	String productName = productLine[0];
        	
        	Product product = new Product(productName, productPrice);
        	products.add(product);
        }
        br.close();
        
        Collections.sort(products, new ProductComparator());
        
        File outputFile = new File("Output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter((outputFile)));
        for (Product product : products) {
        	String output = product.getPrice() + " " + product.getName();
        	bw.write(output);
        	bw.newLine();
		}
        bw.close();
    }
}

    


	