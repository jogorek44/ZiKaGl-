package Logic;
import java.io.*;
import javax.swing.JTextField;
import GUI.Bank;

public class BalanceFileHandler {
    private static final String BALANCE_FILE = "balance.txt";


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
}
