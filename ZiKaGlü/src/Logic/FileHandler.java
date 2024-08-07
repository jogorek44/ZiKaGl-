package Logic;
import java.io.*;

import javax.swing.JTextField;
import GUI.Bank;
import GUI.Shop;

public class FileHandler {
    private static final String BALANCE_FILE = "balance.txt";
    private static final String FILE_PATH = "shopping_cart.txt";

	// Methode zum Laden des Kontostands aus Datei
		public static void loadBalanceFromFile() {
			try (BufferedReader reader = new BufferedReader(new FileReader(BALANCE_FILE))) {
	            String line = reader.readLine();
	            if (line != null) {
	                Bank.balance = Double.parseDouble(line);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Balance file not found, starting with balance 0.0");
	        } catch (IOException | NumberFormatException e) {
	            System.out.println("Empty Account or error reading balance file, starting with balance 0.0");
	        }		
		}
		
		// Methode zum Speichern des Kontostands in Datei
	    public static void saveBalanceToFile() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BALANCE_FILE))) {
	            writer.write(String.format("%.2f", Bank.balance));
	        } catch (IOException e) {
	            System.out.println("Error saving balance to file");
	        }
	    }
	    public static void saveShoppingCart(String price, String quantity) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
	            writer.write("Total Price: $" + price); 
	            writer.newLine();
	            writer.write("Quantity: " + quantity);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Methode zum Laden des Einkaufswagens aus Datei
	    public static String[] loadShoppingCart() {
	        String[] cartData = new String[2]; // Index 0: Preis, Index 1: Menge
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
	            String line;
	            // Liest die erste Zeile für den Preis
	            if ((line = reader.readLine()) != null && line.startsWith("Total Price: $")) {
	                cartData[0] = line.substring("Total Price: $".length());
	            }
	            // Liest die zweite Zeile für die Menge
	            if ((line = reader.readLine()) != null && line.startsWith("Quantity: ")) {
	                cartData[1] = line.substring("Quantity: ".length());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return cartData;
	    }
	    }
	   

