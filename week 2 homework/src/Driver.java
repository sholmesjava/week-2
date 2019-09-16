import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		House h = new House(); 
		        System.out.println(h); 
		        System.out.println(h.toString()); 
		        
		 }       
		        public void add(House h) {
		        	int i = 0;
		        		for (i=0; i<3; i++){
		        		Scanner in = new Scanner(System.in);
		        		System.out.println("Enter the House ID: ");
		        		h.setId(in.nextInt());
		        		
		        		System.out.println("Enter the price for the House: ");
		        		h.setPrice(in.nextFloat());
		        		
		        		System.out.println("Enter the advertiser of the house: ");
		        		h.setAdvertiser(in.next());
		        		
		        		
		        		try {
		        			FileWriter file = new FileWriter("house.txt", true);
		        			file.write(+h.getId()+" "+h.getPrice()+" "+h.getAdvertiser());
		        			file.close();
		        		}catch(IOException e) {
		        			System.out.println("An error occured");
		        		}
		        		
		        	}
		        		
		        		
		        		
		        		
		        }
		        
		        
		        
		        

	

}
